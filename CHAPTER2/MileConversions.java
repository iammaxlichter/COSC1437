package CHAPTER2;

class MileConversions {
    public static void main(String[] args) {
        
        final double INCHES_IN_MILE = 63360.0;
        final double FEET_IN_MILE = 5280.0;
        final double YARDS_IN_MILE = 1760.0;

        double miles = 4.0;
        System.out.println(miles + " miles is " + miles * INCHES_IN_MILE + " inches, or " + miles * FEET_IN_MILE + " feet, or " + miles * YARDS_IN_MILE + " yards");

    }
}
