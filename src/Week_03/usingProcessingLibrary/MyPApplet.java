package Week_03.usingProcessingLibrary;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {

    private String URL = "https://processing.org/reference/images/image_0.png";
    private PImage backgroundImg;

    //Executed once
    public void setup() {
        size(200, 200);
        backgroundImg = loadImage(URL, "jpg");
        /*background(255, 200, 200);*/
    }

    //Loops often
    public void draw() {
        backgroundImg.resize(0, height);
        image(backgroundImg, 0, 0);
        int[] color = sunColorSet(second());
        fill(color[0],color[1],color[2]);
        /*fill(255,209,0);*/
        ellipse(width/4, height/5, width/5, height/5);
    }

    private int[] sunColorSet(float seconds) {
        int[] rgb = new int[3];

        float diffFrom30 = Math.abs(30-seconds);

        float ratio = diffFrom30/30;
        rgb[0] = (int)(255*ratio);
        rgb[1] = (int)(255*ratio);
        rgb[2] = 0;

        return rgb;
    }

    public static void main (String... args) {
        MyPApplet pt = new MyPApplet();
        PApplet.runSketch(new String[]{"ProcessingTest"}, pt);
    }

}
