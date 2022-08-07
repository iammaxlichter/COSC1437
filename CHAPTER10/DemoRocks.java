package CHAPTER10;

public class DemoRocks
{
    public static void main(String[] args){
        Rock rock = new Rock(2, 5.0);
        System.out.println("Number of samples: " + rock.getSampleNumber());
        System.out.println("Weight: " + rock.getWeight());
        System.out.println("Description: " + rock.getDescription());

        IgneousRock rock2 = new IgneousRock(3, 7.0);
        System.out.println("Number of samples: " + rock2.getSampleNumber());
        System.out.println("Weight: " + rock2.getWeight());
        System.out.println("Description: " + rock2.getDescription());

        SedimentaryRock rock3 = new SedimentaryRock(3, 7.0);
        System.out.println("Number of samples: " + rock3.getSampleNumber());
        System.out.println("Weight: " + rock3.getWeight());
        System.out.println("Description: " + rock3.getDescription());

        MetamorphicRock rock4 = new MetamorphicRock(3, 7.0);
        System.out.println("Number of samples: " + rock4.getSampleNumber());
        System.out.println("Weight: " + rock4.getWeight());
        System.out.println("Description: " + rock4.getDescription());
    }
}
