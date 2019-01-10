package Chapter05;

import java.util.Scanner;

/**
 * Adds up the votes. Pretty cool right?
 *
 * @author Jacob Thomas
 */
public class P5 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vote = "";
        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;

        do {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            vote = input.next().toUpperCase();
            switch (vote) {
                case "Y":
                    ++yesVotes;
                    break;
                case "N":
                    ++noVotes;
                    break;
                case "Q":
                    break;
                default:
                    ++invalidVotes;
                    System.out.print("INVALID CODE: ");
                    break;
            }
        } while (!vote.equals("Q"));

        System.out.println("Yes votes: " + yesVotes);
        System.out.println("No votes: " + noVotes);
        System.out.println("Invalid votes: " + invalidVotes);
        System.out.println("Total votes: " + (yesVotes + noVotes + invalidVotes));
    }
}
