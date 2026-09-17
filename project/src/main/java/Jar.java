import java.util.Random;

public class Jar{

    // what kind of item in the jar
    private String itemName;

    // Max number of items the jar could hold, set by admin
    private int maxItemCount;

    // Actual number of items in the jar
    private int actualItemCount;

    //Create a jar for given item with max capacity
    public Jar(String itemName, int maxItemCount){
        this.itemName = itemName;
        this.maxItemCount = maxItemCount;
    }
    //Return name of items stored in the jar
    public String getItemName(){
        return itemName;
    }

    //Return max number of items the jar can hold
    public int getMaxItemCount(){
        return maxItemCount;
    }
    //Return actual number of items in the jar
    // to compare vs player guess

    public int getActualItemCount(){
        return actualItemCount;
    }

    // Fills the jar with a random number of items between 1 and maxItemsCount
    public void fill(){
        Random random = new Random();
        int randomNumber = random.nextInt(maxItemCount)+1;
        this.actualItemCount = randomNumber;
    }
        
 }