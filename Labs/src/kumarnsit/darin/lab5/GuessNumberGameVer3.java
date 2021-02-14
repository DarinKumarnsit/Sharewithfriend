package kumarnsit.darin.lab5;

public class GuessNumberGameVer3 extends GuessNumberGameVer2  {

    public GuessNumberGameVer3() {
        super();
    }

    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
    }

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

   @Override
    //method that show question to user
    public void askPlayagain() {
        super.askPlayagain();
        if (ask_playagain.equalsIgnoreCase("v")){
            guessAverage();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("m")){
            guessMin();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("x")){
            guessMax();
            askPlayagain();
        }
    }

    //method that show Average num of guesses
    public void guessAverage() {
        int guesses_sum = 0;
        double howMany_guesses = guesses.length;
        for (int guess : guesses) {
            guesses_sum = guesses_sum + guess;
        }
        double guesses_average = guesses_sum / howMany_guesses;
        System.out.println("Average = " + guesses_average);
    }

    //method that show min num of guesses
    public void guessMin() {
        int guesses_min = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i] < guesses_min) {
                guesses_min = guesses[i];
            }
        }
        System.out.println("Min = " + guesses_min);
    }

    //method that show max num of guesses
    public void guessMax() {
        int guesses_max = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i] > guesses_max) {
                guesses_max = guesses[i];
            }
        }
        System.out.println("Max = " + guesses_max);
    }

    public void playGames() {
        super.playGames();
    }

}
