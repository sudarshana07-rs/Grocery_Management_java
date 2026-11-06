import java.util.Scanner;
public class demo{
    // Main method
    public static void main(String args[ ]){
        Scanner sc= new Scanner(System.in);
        System.out.println("==== Grocery Mangement System ===");
        System.out.println();
        System.out.println("--- Welcome to XYZ Supermarket ---");
        System.out.println();
        // To display the Grocery List
        items myItems = new items();
        System.out.println("Do you want to see the Grocery list (Yes/No): ");
        String see_items= sc.nextLine();
        if(see_items.equals("Yes")){
            myItems.displayItems();
        }
        else{
        while(!see_items.equals("Yes")){
        System.out.println("Check the Grocery List");
        }
    }
}
}
    // Items class
class items{
    void displayItems(){
    System.out.println();
        System.out.println("---- GROCERY ITEM LIST ---");
        System.out.println("Sl.no\tProduct\tUnit\tPrice");
        System.out.println("1\tRice\t1 kg\tRs.60");
        System.out.println("2\tSugar\t1 kg\tRs.50");
        System.out.println("3\tDal\t1 kg\tRs.150");
        System.out.println("4\tWheat\t1 kg\tRs.45");
        System.out.println("5\tMilk\t1 litre\tRs.60");
    }
}
