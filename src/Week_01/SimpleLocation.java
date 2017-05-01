package Week_01;

/**
 * Created by Suwadith on 5/1/2017.
 */
public class SimpleLocation {

    public double latitude;
    public double longitude;

    //Default Constructor
    public SimpleLocation(){
        this.latitude = 32.9;
        this.longitude = -117.2;
    }

    //Overloaded Constructor
    public SimpleLocation(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }

    //Normal Method which needs an object to calculate the distance
    public double distance(SimpleLocation other){
        //return getDist(this.latitude, this.longitude, other.latitude, other,longitude);
        return 0.0;
    }

    //Overloaded Method which simple needs the end point's Latitude and Longitude,
    //so that it can use Default constructor's Latitude and Longitude as starting point Coordinates
    public double distance(double otherLat, double otherLon){
        return 0.0;
    }

}
