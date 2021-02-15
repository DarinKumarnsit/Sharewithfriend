package kumarnsit.darin.lab5;
/*
 * TestGuessNumberGenerator which includes the main method to calls another method for test.
 *
 * Author: Darin Kumarnsit
 * ID: 623040249-6
 * Sec: 2
 * Date: February 12, 2021
 *
 */
public class TestGuessNumberGenerator{

    //method to test GuessNumberGameVer1 class
    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20, 5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
    }

    //method to test GuessNumberGameVer1 class
    public static void testSetterGetterMethods() {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The first guess number game is");
        System.out.println(gng);
        System.out.println("Now, the number of game is " + gng.getNumOfGames());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 20);
        System.out.println("Creating another guess number game");
        System.out.println("Now, the number of game is " + gng2.getNumOfGames());

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new settings");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", max num is " + gng.getMaxNum() +
                ", and max tries is " + gng.getMaxTries());
    }

    //method to test GuessNumberGameVer2 class
    public static void testPlayGames() {
        GuessNumberGameVer2 gng = new GuessNumberGameVer2(5, 10, 4);
        gng.playGames();
    }

    //method to test GuessNumberGameVer3 class
    public static void testPlayGamesVer3() {
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(5, 10, 4);
        gng.playGames();
    }

    public static void main(String[] args) {
        testConstructors();
        testSetterGetterMethods();
        testPlayGames();
        testPlayGamesVer3();
    }
}
