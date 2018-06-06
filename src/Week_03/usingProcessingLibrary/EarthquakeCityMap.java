package Week_03.usingProcessingLibrary;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthquakeCityMap extends PApplet {

    private UnfoldingMap map;

    public void setup() {
        size(950, 600, OPENGL);
        map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
        map.zoomToLevel(1);
        MapUtils.createDefaultEventDispatcher(this, map);
    }

    private void addKey() {

    }

    public void draw() {
        background(10);
        map.draw();
        addKey();
    }

    public static void main (String... args) {
        EarthquakeCityMap pt = new EarthquakeCityMap();
        PApplet.runSketch(new String[]{"ProcessingTest"}, pt);
    }

}
