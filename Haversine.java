// Java program to calculate Distance Between Two Points on Earth
// https://www.geeksforgeeks.org/program-distance-two-points-earth/
public class Haversine {

    /**
     * Computes the distance between two points on a sphere
     * given their longitudes and latitudes
     *
     * @param latitude1  double latitude of the first location
     * @param longitude1 double longitude of the first location
     * @param latitude2  double latitude of the second location
     * @param longitude2 double longitude of the second location
     * @return the distance between these two locations
     */
    public static double distance(double latitude1, double longitude1,
            double latitude2, double longitude2) {

        // The Math class contains a method named toRadians
        // which converts from degrees to radians.
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        // Haversine formula
        // https://fr.wikipedia.org/wiki/Formule_de_haversine
        double dlon = longitude2 - longitude1;
        double dlat = latitude2 - latitude1;
        double a = Math.pow(Math.sin(dlat / 2.0), 2.0)
                + Math.cos(latitude1) * Math.cos(latitude2)
                        * Math.pow(Math.sin(dlon / 2.0), 2.0);
        double c = 2.0 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometres. Use 3958.8 for miles or 3440.1 for nautical
        // miles
        double radius = 6371.0;

        // calculate the result
        double distance = c * radius;
        return (distance);
    }
}