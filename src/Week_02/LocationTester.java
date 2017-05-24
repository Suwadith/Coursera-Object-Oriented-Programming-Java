package Week_02;

import Week_01.SimpleLocation;

/**
 * Created by Suwadith on 5/24/2017.
 */
public class LocationTester {

    public static void main(String[] args){
        double latitude = -15.5;
        SimpleLocation lima = new SimpleLocation(latitude, -77.0);
        latitude = -12.0;
        System.out.println(lima.getLatitude());
    }

}
