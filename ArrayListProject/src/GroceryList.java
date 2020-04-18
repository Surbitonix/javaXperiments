import java.util.ArrayList;

public class GroceryList {
    private int[] myList = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    //add an element
    public void addGroceryToItem(String item)
    {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have "+ groceryList.size() + " items on your grocery list");
        for (int i = 0; i<groceryList.size(); i++)
        {
            System.out.println((i+1) + ". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem)
    {
        int position = findItems(currentItem);
        if (position>=0)
        {
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Item "+ (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItems(item);
        if (position >= 0 )
        {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position)
    {
        //String theItem = groceryList.get(position-1);
        groceryList.remove(position-1);
    }

    private int findItems(String searchItem)
    {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItems(searchItem);
        if (position >= 0)
        {
            return true;
        }
        return false;

    }
}
