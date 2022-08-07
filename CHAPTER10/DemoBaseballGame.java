package CHAPTER10;

public class DemoBaseballGame {
    public static void main(String[] args) {
    
        BaseballGame baseballGame = new BaseballGame();

        baseballGame.setNames("North", "East");
        System.out.println("\n Start");
        display(baseballGame);

        baseballGame.setScore(0, 0, 2);
        baseballGame.setScore(1, 0, 0);

        System.out.println("\nAfter setting first inning");
        display(baseballGame);

        System.out.println("\nTrying to set fifth inning (inning 4) too soon");
        baseballGame.setScore(0, 4, 1);
        System.out.println("\nAfter setting second inning scores");
        baseballGame.setScore(0, 1, 1);
        baseballGame.setScore(1, 1, 1);

        display(baseballGame);

        System.out.println("\nTryng to use an invalid inning");
        baseballGame.setScore(0, 9, 2);
        System.out.println("\nTrying to use an invalid team");
        baseballGame.setScore(2, 2, 2);
        System.out.println("\nAfter setting the rest of the innings");

        for(int t = 0; t < 2; ++t)
            for(int i = 2; i < baseballGame.getInnings(); ++i)
                baseballGame.setScore(t, i, 0);
                display(baseballGame);
        }

        public static void display(BaseballGame b) {

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

            if(b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == BaseballGame.UNPLAYED)
                System.out.println("No innings played yet.");

            if(!areInningsLeft) {
                if(total[0] > total[1])
                    System.out.println(b.getName(0) + " win!");
                else
                    if(total[0] < total[1])
                        System.out.println(b.getName(1) + " win!");
                    else
                        System.out.println("Tie Game!");
            }
        }
}
