package kumarnsit.darin.lab5;
/*
 * GuessNumberGameVer3 inherited from GuessNumberGameVer2
 * Define these three new methods which are guessAverage(), guessMin() and guessMax()
 * to calculate the average, minimum and maximum of the guesses respectively.
 * If the user types in ‘v’, the program should call method guessAverage()
 * If the user types in ‘m’, the program should call the method guessMin()
 * If the user types in ‘x’, the program should call the method guessMax()
 * When a user types in incorrect command, the program repeats the question
 *
 * Author: Darin Kumarnsit
 * ID: 623040249-6
 * Sec: 2
 * Date: February 12, 2021
 *
 */
import java.util.Scanner;
//inherited from GuessNumberGameVer2
public class GuessNumberGameVer3 extends GuessNumberGameVer2  {

    //constructors to set default
    public GuessNumberGameVer3() {
        super();
    }

    //constructors for 2 argument
    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
    }

    //constructors for 3 argument
    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

   @Override
   //method that show question to user
   public void askPlayagain() {
        Scanner ask_playagain_input = new Scanner(System.in);
        System.out.println('\n' + "If you want to play again? type 'y' to continue or 'q' to quit: "+ '\n' +
                "Type 'a' to see all your guesses or 'g' to see a guess on a specific play. "+ '\n' +
                "Type 'v' to see average or 'm' to see minimum  or 'x' to see maximum of all your guesses.");
        String ask_playagain = ask_playagain_input.next();

        if (ask_playagain.equalsIgnoreCase("y")){
            this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            playGames();

        }if (ask_playagain.equalsIgnoreCase("a")){
            showGuesses();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("g")){
            showSpecific();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("v")){
            guessAverage();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("m")){
            guessMin();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("x")){
            guessMax();
            askPlayagain();

        }if (ask_playagain.equalsIgnoreCase("q")){
            System.exit(0);

        }else{
            askPlayagain();}
    }

    //method that show Average num of guesses
    static void guessAverage() {
        int guesses_sum = 0;
        double howMany_guesses = numGuesses;
        for (int guess : guesses) {
            guesses_sum = guesses_sum + guess;
        }
        double guesses_average = guesses_sum / howMany_guesses;
        System.out.println("Average = " + guesses_average);
    }

    //method that show min num of guesses
    static void guessMin() {
        int guesses_min = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i] < guesses_min) {
                guesses_min = guesses[i];
            }
        }
        System.out.println("Min = " + guesses_min);
    }

    //method that show max num of guesses
    static void guessMax() {
        int guesses_max = guesses[0];
        for (int i = 0; i < numGuesses; i++) {
            if (guesses[i] > guesses_max) {
                guesses_max = guesses[i];
            }
        }
        System.out.println("Max = " + guesses_max);
    }

}
