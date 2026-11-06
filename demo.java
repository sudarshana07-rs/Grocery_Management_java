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
    // Items class
static class items{
    void displayItems(){
        System.out.println("---- GROCERY ITEM LIST ---");
        System.out.println("Sl.no\tProduct\tUnit\tPrice");
        System.out.println("1\tRice\t1 kg\tRs.60");
        System.out.println("2\tSugar\t1 kg\tRs.60");
    }
}
}