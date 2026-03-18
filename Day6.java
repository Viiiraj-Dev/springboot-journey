public class Day6 {
    public static void main(String[] args) {
        // Create product objects
        Product p1 = new Product("Laptop", "Electronics", 75000, 10);
        Product p2 = new Product("Phone", "Electronics", 45000, 0);
        Product p3 = new Product("Desk", "Furniture", 12000, 5);
        
        // Display all products
        System.out.println("===== Prdouct Catalog =====");
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        // Use methods
        System.out.println("===== Discounted Prices =====");
        System.out.println("Laptop after 10% off : Rs. " + p1.getDisountedPrice(0.10));
        System.out.println("Desk after 20% off: Rs. " + p3.getDisountedPrice(0.20));

        // Array of objects
        System.out.println("\n===== Available Products =====");
        Product[] products = {p1, p2, p3};

        for (Product p : products){
            if(p.isAvailable()){
                System.out.println(p.name + " is available");
            }
        }

    }   
}

/*
Key Things to Remember

Class = blueprint, Object = real thing built from blueprint
new keyword creates an object in memory
Constructor sets up object data at creation time
this refers to the current object's own fields
One class → many objects, each with their own independent data
Every Spring Boot entity (User, Product, Order) is exactly the class you built today — just with annotations added
*/
