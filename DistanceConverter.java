public class DistanceConverter {
    public static void main(String[] args) {
        double distanceKm = 2614;

        double distanceMeters = distanceKm * 1000;
        double distanceFeet = distanceKm * 3280.84;
        double distanceInches = distanceKm * 39370.1;
        double distanceCentimeters = distanceKm * 100000;

        System.out.println("Distance in Kilometers: " + distanceKm + " km");
        System.out.println("Distance in Meters: " + distanceMeters + " meters");
        System.out.println("Distance in Feet: " + distanceFeet + " feet");
        System.out.println("Distance in Inches: " + distanceInches + " inches");
        System.out.println("Distance in Centimeters: " + distanceCentimeters + " cm");
    }
}
