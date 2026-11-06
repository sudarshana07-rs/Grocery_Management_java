public class demo{
    // Main method
    public static void main(String args[ ]){
        System.out.println("==== Grocery Mangement System ===");
        System.out.println();
        System.out.println("--- Welcome to XYZ Supermarket ---");
        System.out.println();
        items myItems = new items();
        myItems.displayItems();

    }
}
    // Items class
class items{
    void displayItems(){
        System.out.println("---- GROCERY ITEM LIST ---");
        System.out.println("Sl.no\tProduct\tUnit\tPrice");
        System.out.println("1\tRice\t1 kg\tRs.60");
        System.out.println("2\tSugar\t1 kg\tRs.50");
        System.out.println("3\tToor Dal\t1 kg\tRs.150");
        System.out.println("4\tWheat Flour\t1 kg\tRs.45");
        System.out.println("5\tMilk\t1 litre\tRs.60");
    }
}
