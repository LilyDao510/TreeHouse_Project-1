public class GuessingGame {
    public static void main(String[] args) {
        Prompter io = new Prompter();

        //Set up the jar

        io.printSetupHeader();
        String itemName = io.askItemName();
        int maxItemCount = io.askMaxItemCount(itemName);
        io.printSetupFooter();

        // Create jar and fill with secret amount

        Jar jar = new Jar(itemName, maxItemCount);
        jar.fill();


        io.printWelcome();

        int numAttempts = 0; // only valid guesses are counted

        // Ask for 1st guess with info of the min/max range
        int guess = io.askGuess(jar);

        //Keep asking until the guess is correct
        while (true) { 
            //If guess is out of range, ask again without counting it as an attempt
            if(guess <1 || guess > jar.getMaxItemCount()){
                io.printOutOfRange(jar.getMaxItemCount());
                guess = io.askAnotherGuess();
                continue;
            }

            //Only valid guesses count toward the attempt total
            numAttempts++;

            //Compare the player's guess vs number of items in the jar
            if(guess == jar.getActualItemCount()){
                //Correct guess: report the score and break loop
                io.printWin(numAttempts);
                break;
            } else if(guess > jar.getActualItemCount()){
                io.printTooHigh();
            } else {
                io.printTooLow();
            }
            //Continue the loop
            guess = io.askAnotherGuess();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }
}