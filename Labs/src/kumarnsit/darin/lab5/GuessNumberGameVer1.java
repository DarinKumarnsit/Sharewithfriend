package kumarnsit.darin.lab5;
/*
 * Create five protected variables and Create three constructors [ GuessNumberGameVer1() GuessNumberGameVer1(int, int)
 * GuessNumberGameVer1(int, int, int)].When initializing variables use the keyword “this”.
 * Create public getters and setters for all the protected variables
 * When creating setters use the keyword “this” Create a public method playGame() Override a public method toString();
 * Create a public method getNumOfGames() that returns the value of the variable numOfGames
 *
 * Author: Darin Kumarnsit
 * ID: 623040249-6
 * Sec: 2
 * Date: February 12, 2021
 *
 */
import java.util.Scanner;
public class GuessNumberGameVer1 {
    protected int minNum, maxNum, correctNum, maxTries;
    protected static int numOfGames = 0; //How many times user play

    //constructors to set default
    public GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        //random correct number
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        //incremented round that user play by 1
        numOfGames++;
    }

    //constructors for 2 argument
    public GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    //constructors for 3 argument
    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        numOfGames++;
    }

    //method to get minimal number
    public int getMinNum(){
        return minNum;
    }

    //method to set minimal number
    public void setMinNum(int minNum){
        this.minNum = minNum;
    }

    //method to get maximum number
    public int getMaxNum(){
        return maxNum;
    }

    //method to set maximum number
    public void setMaxNum(int maxNum){
        this.maxNum = maxNum;
    }

    //method to get how many time that user can guess the number
    public int getMaxTries(){
        return maxTries;
    }

    //method to set how many time that user can guess the number
    public void setMaxTries(int maxTries){
        this.maxTries = maxTries;
    }


    //method that allows the user to enter a guess number until the user guesses correctly or there is run out of the number of guesses.
    public void playGame() {
        for (int i = 1; i <= maxTries; i++) {
            System.out.print("Please enter a guess ( " + minNum + " - " + maxNum + " ):");
            Scanner scan = new Scanner(System.in);
            int guess_input = scan.nextInt();

            if (guess_input == correctNum) {
                System.out.println("Congratulations!  That's correct");
                break;
            } else if (guess_input < correctNum) {
                System.out.println("Please type a higher number! Number of remaining tries: " + (maxTries - i));
            } else if (guess_input > correctNum) {
                System.out.println("Please type a lower number! Number of remaining tries: " + (maxTries - i));
            }
            if (i >= maxTries) {
                break;
            }
        }
    }

    //@Override to indicate and check that the method is overriding that class method
    @Override
    public String toString(){
        return "GuessNumberGame with min number as " + minNum + " max number as "
                + maxNum + " max number of tries as " + maxTries;   //return color and filled
    }

    //method to get round that user play game.
    public int getNumOfGames() {
        return numOfGames;
    }

}


