package Week_01;

/**
 * Created by Suwadith on 5/1/2017.
 */
public class SimpleLocation {

    public double latitude;
    public double longitude;

    public SimpleLocation(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }

    public double distance(SimpleLocation other){
        //return getDist(this.latitude, this.longitude, other.latitude, other,longitude);
        return 0.0;
    }

}
