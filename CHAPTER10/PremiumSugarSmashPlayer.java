package CHAPTER10;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer {

    private int[] scores = new int[40];
    private boolean accessLevel;

    public PremiumSugarSmashPlayer(double pay){
        if(pay >= 2.99){
            accessLevel = true;
        }
        else{
            accessLevel = false;
        }
    }

    public void setScore(int score, int gameLevel){

        if(accessLevel){
            if(gameLevel < 0 || gameLevel > scores.length){
                System.out.println("Invalid Game Level");
            }
            else{
                scores[gameLevel] = score;
            }
        }
    }

    public int getScore(int gameLevel){
        if(gameLevel >= 0 && gameLevel < scores.length){
            return scores[gameLevel];
        }
        else{
            System.out.println("Invalid Game Level");
            return -1;
        }
    }

}
