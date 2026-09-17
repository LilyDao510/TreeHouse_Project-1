import java.util.Scanner;
public class Prompter{
    //Read user input from the console
    private Scanner input;

    // Create Prompter and initialize the Scanner
    public Prompter(){
        input = new Scanner(System.in);
    }

    // Ask what type of item fills the jar
    public String askItemName(){
        System.out.printf("What type of item should go in the jar?:  ");
        return input.nextLine();
    }

    // Ask the jar max item count
    public int askMaxItemCount(String itemName){
        System.out.printf("What is the maximum amount of %s?: ", itemName);
        return Integer.parseInt(input.nextLine());
    }
    // Ask for the 1st guess, showing the item name and valid range
    public int askGuess(Jar jar){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ",
            jar.getItemName(), jar.getMaxItemCount());
        return Integer.parseInt(input.nextLine());
    }

    //Read a follow up guess without repeating the full question
    public int askAnotherGuess(){
        return Integer.parseInt(input.nextLine());
    }
    // Print the header for admin setup section
    public void printSetupHeader(){
        System.out.printf("%nADMINISTRATOR SETUP%n");
        System.out.println("--------------------------------");
    }
    //Print the footer that closes the admin setup section
    public void printSetupFooter(){
        System.out.printf("---------------------------------");
        System.out.println("");
    }
    //Greets the player at the start of game
    public void printWelcome(){
        System.out.println("--------------------------------");
        System.out.println("Welcome to the guessing game!");
    }
    //Tell player the guess is outside the allowed range
    public void printOutOfRange(int maxItemCount){
        System.out.printf("%n The picked number must between 1 and %d.%n",maxItemCount);
    }
    //Tell the player their guess was too high
    public void printTooHigh(){
        System.out.println("Your guess is too high");
    }
    //Tell the player their guess was too low
    public void printTooLow(){
        System.out.println("Your guess is too low");
    }
    // Display the winning message and the attempts number
    public void printWin(int numAttempts){
        System.out.printf("Congrats! You got it in %d attempts.%n",numAttempts);
    }
}