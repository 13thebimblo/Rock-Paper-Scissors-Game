// Import Scanner
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        // Variables and new Scanner
        int playerOneChoice = 0;
        int playerTwoChoice = 0;
        Scanner in = new Scanner(System.in);
        
        // Initiate game
        System.out.println(Colors.ANSI_RESET + "You want to play Rock, Paper, Scissors? Let's go!");
        Thread.sleep(1000);
        printSpace(1);
        
        
       do { 
            // Choose rock paper scissors and store choices
            do {
                System.out.println(Colors.ANSI_PURPLE + "Player One" + Colors.ANSI_RESET + ", make your choice: " + Colors.ANSI_BLUE + "Rock (1)" + Colors.ANSI_RESET + ", " + Colors.ANSI_BLUE + "Paper (2)" + Colors.ANSI_RESET + ", or " + Colors.ANSI_BLUE + "Scissors (3)" + Colors.ANSI_RESET + "...");
                playerOneChoice = in.nextInt();
                if (playerOneChoice < 1 || playerOneChoice > 3) {
                    printSpace(1);
                    System.out.println(Colors.ANSI_RED + "That's not how you play this game!" + Colors.ANSI_RESET);
                    printSpace(1);
                }
            } while (playerOneChoice < 1 || playerOneChoice > 3);

            printSpace(1);
            System.out.println(Colors.ANSI_RESET + "Good choice, now look away so " + Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RESET + "can make their choice.");
            Thread.sleep(3000);
            printSpace(50);
            
            do {
                System.out.println(Colors.ANSI_CYAN + "Player Two" + Colors.ANSI_RESET + ", make your choice: " + Colors.ANSI_BLUE + "Rock (1)" + Colors.ANSI_RESET + ", " + Colors.ANSI_BLUE + "Paper (2)" + Colors.ANSI_RESET + ", or " + Colors.ANSI_BLUE + "Scissors (3)" + Colors.ANSI_RESET + "...");
                playerTwoChoice = in.nextInt();
                if (playerTwoChoice < 1 || playerTwoChoice > 3) {
                    System.out.println(Colors.ANSI_RED + "That's not how you play this game!" + Colors.ANSI_RESET);
                    printSpace(1);
                }
            } while (playerTwoChoice < 1 || playerTwoChoice > 3);
            printSpace(1);
            System.out.println(Colors.ANSI_RESET + "Good choice. are you ready to play?");
            printSpace(1);
            Thread.sleep(1000);



            // TODO: Count down, reveal choices
            System.out.println(Colors.ANSI_RED + "Rock..." + Colors.ANSI_RESET);
            Thread.sleep(1000);
            System.out.println(Colors.ANSI_YELLOW + "Paper..." + Colors.ANSI_RESET);
            Thread.sleep(1000);
            System.out.println(Colors.ANSI_YELLOW + "Scissors..." + Colors.ANSI_RESET);
            Thread.sleep(1000);
            System.out.println(Colors.ANSI_GREEN + "Shoot!" + Colors.ANSI_RESET);
            Thread.sleep(1000);
            printSpace(1);
            
            if (playerOneChoice == 1) {
                System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "ROCK" + Colors.ANSI_RESET + "!");
            }
            else if (playerOneChoice == 2) {
                System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "PAPER" + Colors.ANSI_RESET + "!");
            }
            else {
                System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "SCISSORS" + Colors.ANSI_RESET + "!");
            }

            if (playerTwoChoice == 1) {
                System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "ROCK" + Colors.ANSI_RESET + "!");
            }
            else if (playerTwoChoice == 2) {
                System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "PAPER" + Colors.ANSI_RESET + "!");
            }
            else {
                System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RESET + "chose " + Colors.ANSI_BLUE + "SCISSORS" + Colors.ANSI_RESET + "!");
            }
            printSpace(1);
            

            // TODO: Identify the winner!
            if (playerOneChoice == playerTwoChoice) {
                System.out.println(Colors.ANSI_YELLOW + "It's a tie! Let's play again to see who wins!" + Colors.ANSI_RESET);
                printSpace(3);
            }
            else if(Math.abs((playerOneChoice - playerTwoChoice)) == 1) {
                if (playerOneChoice > playerTwoChoice) {
                    System.out.println(Colors.ANSI_PURPLE + "Player One" + Colors.ANSI_GREEN + " wins! " + Colors.ANSI_RESET);
                    if (playerOneChoice == 2) {
                        System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RED + "got smothered to death!" + Colors.ANSI_RESET);
                    }
                    else {
                        System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_RED + "got snipped to death!" + Colors.ANSI_RESET);
                    }
                }
                else {
                    System.out.println("Player Two wins! ");
                    if (playerTwoChoice == 2) {
                        System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_RED + "got smothered to death!" + Colors.ANSI_RESET);
                    }
                    else {
                        System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_RED + "got snipped to death!" + Colors.ANSI_RESET);
                    }
                }
            }
            else {
                if (playerOneChoice == 1) {
                    System.out.println(Colors.ANSI_PURPLE + "Player One " + Colors.ANSI_GREEN + "wins!" + Colors.ANSI_CYAN + "\nPlayer Two " + Colors.ANSI_RED + "got crushed to death!" + Colors.ANSI_RESET);
                }
                else {
                    System.out.println(Colors.ANSI_CYAN + "Player Two " + Colors.ANSI_GREEN + "wins!" + Colors.ANSI_PURPLE + "\nPlayer One " + Colors.ANSI_RED + "got crushed to death!" + Colors.ANSI_RESET);
                }
            }

       } while (playerOneChoice == playerTwoChoice);

       in.close();

    }

    // Space printing method
    public static void printSpace(int times) {
        do {
        System.out.print("\n");
        times--;
        } while (times > 0);
    }

}
