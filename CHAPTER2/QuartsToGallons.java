package CHAPTER2;

// QuartsToGallons.java
class QuartsToGallons {
    public static void main(String[] args) {
        final byte QUARTS_IN_GALLON = 4;
        final byte quartsNeeded = 18;
        byte leftover = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + QUARTS_IN_GALLON + " gallons plus " + leftover + " quarts");

    }
}
