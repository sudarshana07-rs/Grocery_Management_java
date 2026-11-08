import java.util.Scanner;
public class demo{
    // Main method
    public static void main(String args[ ]){
        // Intro Statements
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
        System.out.println("Check the Grocery List");
        }

        // While loop
        while(true){
        // Product input
        System.out.println("---------------------------");
        System.out.println("Enter the Product: ");
        int choice = sc.nextInt();

        // Creating total variable
        int total=0;              

        // For Choice 6 and 7                              
        if(choice==6){            
        
            System.out.println("TOTAL AMOUNT: Rs. "+total);
            continue;
        }                                                  
        if(choice==7){                                     
            System.out.println("Thank You for Shoping!!!");
            break;                                         
        }                                                  

        // Quantity input                          
        System.out.println("Enter the Quantity: ");
        int quantity = sc.nextInt();   

        // Switch Case
        switch (choice) {
                case 1:
                    total= 60*quantity;
                    System.out.println(quantity+ "kg of Rice added Successfully!!!");
                    break;
                case 2:                                                           
                    total= 50*quantity;                                           
                    System.out.println(quantity+ "kg of Sugar added Successfully!!!");
                    break;    
                case 3:                                                           
                    total= 150*quantity;                                           
                    System.out.println(quantity+ "kg of Dal added Successfully!!!");
                    break;            
                case 4:                                                                                                       
                    total= 50*quantity;                                           
                    System.out.println(quantity+ "kg of Wheat added Successfully!!!");
                    break; 
                case 5:                                                               
                    total= 60*quantity;                                               
                    System.out.println(quantity+ "litre of Milk added Successfully!!!");
                    break;              
                default:
                    System.out.println("INVALID PRODUCT !!!");
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
        System.out.println();
        System.out.println("Press 6 for Total Bill !!!");
        System.out.println("Press 7 to EXIT");
        System.out.println();
    }
}
