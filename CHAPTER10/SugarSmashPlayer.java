package CHAPTER10;

public class SugarSmashPlayer {

    protected int ID;
    protected String screenName;
    public int[] scores = new int[10];
    
    public void setScore(int score, int gameLevel){

        boolean validScores = false;

        if(gameLevel == 0){
            scores[0] = score;
        }

        else{
            for(int index = 0; index < gameLevel && !validScores; index++){
                if (scores[index] > 100){
                    validScores = true;
                }
            }
        }

        if(validScores)
            scores[gameLevel] = score;

        else{
            scores[0] = score;
            System.out.println("Invalid score");
        }
    }

    public int getScore(int gameLevel){
        if (gameLevel >= 0 && gameLevel < scores.length)
            return scores[gameLevel];
        else{
            System.out.println("Invalid game level");
            return -1;
        }
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setScreenName(String screenName){
        this.screenName = screenName;
    }

    public String getScreenName(){
        return screenName;
    }
}
