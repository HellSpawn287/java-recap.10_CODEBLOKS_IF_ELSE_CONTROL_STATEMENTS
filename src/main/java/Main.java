public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelComplete = 5;
        int bonus = 100;

        /*if (score < 5000 && score  > 1000){
            System.out.println("Your score was 5000");
        }else if(score < 1000 ){
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        /*
        Po za blokiem kodu nie można dostać się do zmiennej zainicjowanej wewnątrz niego.
        int saveedFinalScore = finalScore;*/


        //Exercise

        boolean newGameOver = true;
        int secondScore = 1000;
        int newLevelComplete = 8;
        int newBonus = 200;
        System.out.println("Second score is " + secondScore);

        if (newGameOver){
            int finalScore = secondScore + (newLevelComplete * newBonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
