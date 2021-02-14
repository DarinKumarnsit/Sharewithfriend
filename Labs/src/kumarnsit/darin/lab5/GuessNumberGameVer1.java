package kumarnsit.darin.lab5;

import java.util.Scanner;
import java.util.Random;
public class GuessNumberGameVer1 {
    protected int minNum, maxNum, correctNum, maxTries;
    protected static int numOfGames = 0;

    public GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        numOfGames++;
    }

    public int getMinNum(){
        return minNum;
    }

    public void setMinNum(int minNum){
        this.minNum = minNum;
    }

    public int getMaxNum(){
        return maxNum;
    }

    public void setMaxNum(int maxNum){
        this.maxNum = maxNum;
    }

    public int getMaxTries(){
        return maxTries;
    }

    public void setMaxTries(int maxTries){
        this.maxTries = maxTries;
    }


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

    @Override
    public String toString(){
        return "GuessNumberGame with min number as " + minNum + " max number as "
                + maxNum + " max number of tries as " + maxTries;   //return color and filled
    }

    public int getNumOfGames() {
        return numOfGames;
    }

}


