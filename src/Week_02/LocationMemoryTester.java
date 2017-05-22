package Week_02;

import Week_01.SimpleLocation;

/**
 * Created by Suwadith on 5/22/2017.
 */
public class LocationMemoryTester {

    public static void main(String[] args){

        SimpleLocation ucsd = new SimpleLocation(117.0, -29.5);
        SimpleLocation kumamoto = new SimpleLocation(32.4, 130.0);

        ucsd = kumamoto;
        kumamoto = ucsd;

        System.out.println("UCSD's Longitude: " + ucsd.getLatitude() + " Latitude: " + ucsd.getLongitude());
        System.out.println("Kumamoto's Longitude: " + kumamoto.getLatitude() + " Latitude: " + kumamoto.getLongitude());
    }

}
