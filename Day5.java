// Day 5 - Methods (Functions)

public class Day5{

    //Method 1 - no input no output
    public static void printDivider(){
        System.out.println("=====================");
    }

    // Method 2 - input no output
    public static void greetUser(String name){
        System.out.println("Hello, "+ name + " ! Welcome.");
    }

    // Method 3 - input and output
    public static double calculateGST(double price){
        return price * 0.18;
    }

    // Method 4 - multiple inputs and output
    public static double calculateTotal(double price, double gst){
        return price + gst;
    }

    // Check if email is valid (basic check)
    public static boolean isValidEmail(String email){
        return email.contains("@") && email.contains(".");
    }

    // Format full name properly
    public static String formatName(String first, String last){
        return first.trim().toUpperCase() + " " + last.trim().toUpperCase();
    }

    // Generate username from name
    public static String generateUsername(String first, String last){
        return (first.toLowerCase()+"."+last.toLowerCase()).replace(" ", "");
    }

    // Overloaded discount methods
    public static double calculateDiscount(double price){
        return price * 0.10;
    }

    public static double calculateDiscount(double price, double rate){
        return price * rate;
    }

    public static double calculateDiscount(double price, int memberLevel){
        double rate = switch (memberLevel){
            case 1 -> 0.05; //Bronze
            case 2 -> 0.10; //Silver
            case 3 -> 0.20; // Gold
            default -> 0.0;
        };
        return price*rate;
    }

    public static void main(String[] args){
        printDivider();
        greetUser("Viiir");
        printDivider();

        double price = 1000.0;
        double gst = calculateGST(price);
        double total = calculateTotal(price, gst);

        System.out.println("Price : ₹" + price);
        System.out.println("GST   : ₹" + gst);
        System.out.println("Total : ₹" + total);
        printDivider();

        //String utilities
        System.out.println(isValidEmail("viiir@gmail.com"));
        System.out.println(isValidEmail("viiirgmail.com"));
        System.out.println(formatName("viiir", "dev"));
        System.out.println(generateUsername("Viiir", "Dev"));

        // Overloading
        System.out.println("Default discount : ₹" + calculateDiscount(1000));
        System.out.println("Custom discount  : ₹" + calculateDiscount(1000, 0.25));
        System.out.println("Gold discount    : ₹" + calculateDiscount(1000, 3));

    }
}