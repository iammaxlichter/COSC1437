package CHAPTER10;

public class DemoSugarSmash {

    public static void main(String[] args) {
        
        SugarSmashPlayer sugarPlayer = new SugarSmashPlayer();

        sugarPlayer.setID(123);
        sugarPlayer.setScore(50,0);
        sugarPlayer.setScore(70,1);
        sugarPlayer.setScore(120,2);

        System.out.println("SugarSmashPlayer score");

        System.out.println("Score : " + sugarPlayer.getScore(0));
        System.out.println("Score : " + sugarPlayer.getScore(1));
        System.out.println("Score : " + sugarPlayer.getScore(2));

        PremiumSugarSmashPlayer premiumPlayer1 = new PremiumSugarSmashPlayer(2.00);
        premiumPlayer1.setScore(15,0);

        PremiumSugarSmashPlayer premiumPlayer = new PremiumSugarSmashPlayer(3.00);
        premiumPlayer.setID(321);
        premiumPlayer.setScore(15,0);
        premiumPlayer.setScore(50,1);
        premiumPlayer.setScore(20,2);

        System.out.println("PremiumSugarSmashPlayer ID: " + premiumPlayer.getID());

        System.out.println("Premium User score who pay " + "$3");
        System.out.println("Score : " + premiumPlayer.getScore(0));
        System.out.println("Score : " + premiumPlayer.getScore(1));
        System.out.println("Score : " + premiumPlayer.getScore(2));
    }
}
