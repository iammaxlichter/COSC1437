package CHAPTER10;
public class DemoLLBaseballGame{
    public static void main(String[] args) {

        LittleLeagueBaseballGame littleLeagueBaseballGame = new LittleLeagueBaseballGame();
        littleLeagueBaseballGame.setNames("West", "East");

        System.out.println("\nStart");
        display(littleLeagueBaseballGame);

        littleLeagueBaseballGame.setScore(0, 0, 2);
        littleLeagueBaseballGame.setScore(1, 0, 0);

        System.out.println("\nAfter setting first inning");
        display(littleLeagueBaseballGame);

        System.out.println("\nTrying to set fifth inning (inning 4) too soon");
        littleLeagueBaseballGame.setScore(0, 4, 1);
        System.out.println("\nAfter setting second inning scores");
        littleLeagueBaseballGame.setScore(0, 1, 1);
        littleLeagueBaseballGame.setScore(1, 1, 4);
        display(littleLeagueBaseballGame);

        System.out.println("\nTryng to use an invalid inning");
        littleLeagueBaseballGame.setScore(0, 6, 2);
        System.out.println("\nTrying to use an invalid team");
        littleLeagueBaseballGame.setScore(2, 2, 2);
        System.out.println("\nAfter setting the rest of the innings");
        for(int t = 0; t < 2; ++t)
            for(int i = 2; i < littleLeagueBaseballGame.getInnings(); ++i)
                littleLeagueBaseballGame.setScore(t, i, 2);
                littleLeagueBaseballGame.setScore(1, 5, 10); 
                display(littleLeagueBaseballGame);
    }

    public static void display(LittleLeagueBaseballGame b) {
        int[] total = {0, 0};
        boolean areInningsLeft = false;
        int score;
        System.out.println("Game between " + b.getNames());
        for(int t = 0; t < 2; ++t) {
            for(int i = 0; i < b.getInnings(); ++i) {
                score = b.getScore(t, i);
                if(score != BaseballGame.UNPLAYED) {
                    if(i == 0)
                        System.out.print("Team " + t + ": ");
                    System.out.print(score + " ");
                    total[t] += score;
                }
            else
                areInningsLeft = true;
            }

        System.out.println();
        }
        
        if(b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == LittleLeagueBaseballGame.UNPLAYED)
            System.out.println("No innings played yet.");

        if(!areInningsLeft) {
            if(total[0] > total[1])
                System.out.println("Team 1 wins!");
            else
                if(total[0] < total[1])
                    System.out.println("Team 2 wins!");
                else
                    System.out.println("Tie Game!");
        }
    }
}
