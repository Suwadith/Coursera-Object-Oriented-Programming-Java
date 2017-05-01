package Week_01;

/**
 * Created by Suwadith on 5/1/2017.
 */
public class SimpleLocation {

    private double latitude;
    private double longitude;

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

    //Getter
    public double getLatitude(){
        return this.latitude;
    }

    //Setter
    public void setLatitude(double lat){
        if(lat < -180 || lat > 180){
            System.out.println("Illegal Value For Latitude");
        }else {
            this.latitude = lat;
        }
    }

    public double getLongitude(){
        return this.longitude;
    }

    public void setLongitude(double lon){
        if(lon < -180 || lon > 180){
            System.out.println("Illegal Value For Latitude");
        }else {
            this.longitude = lon;
        }
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
