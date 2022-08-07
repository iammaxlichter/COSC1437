package CHAPTER2;

class InchesToFeet {
    public static void main(String[] args) {
       
       final int inches = 86;
       final int InchesToFeet = inches / 12;
       final int InchesLeft = 12 % inches;

       System.out.println(inches + " inches is " + InchesToFeet + " feet and " + InchesLeft + " inches");
    }
}
