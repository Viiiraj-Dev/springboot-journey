public class ATM {
    public static void main(String[] args){
        /*
        ### 🎯 Challenge — ATM Machine (20 min)

        Create a new file `ATM.java`. Build a simple ATM logic **without copy-pasting:**
        ```
        Rules:
        - Account balance = 10000
        - PIN = 5678
        - User enters PIN = 5678 (hardcode this as a variable)
        - Withdrawal amount = 3000 (hardcode as variable)

        Program should:
        1. Check if PIN is correct
        - If wrong → print "Incorrect PIN. Card blocked."
        - If correct → proceed to step 2

        2. If PIN correct, check withdrawal amount:
        - If amount > balance → print "Insufficient funds. Available: 10000"
        - If amount <= 0 → print "Invalid amount"
        - If amount is valid → 
            print "Dispensing 3000..."
            print "Remaining balance: 7000"

        3. Use ternary to print:
        - "Large withdrawal" if amount > 5000
        - "Normal withdrawal" if amount <= 5000
        */

        int acBalance = 10000;
        String pin = "5678";
        String user_pin = "5678";
        int withAmt = 3000;
        
        if(user_pin.equals(pin)){
            if(withAmt > acBalance){
                System.out.println("Insufficient funds. Available: 10000");
            }else if(withAmt <=0){
                System.out.println("Invalid amount");
            }else{
                String message = (withAmt>5000) ? "Large withdrawal" : "Normal withdrawal";
                System.out.println(message);
                System.out.println("Dispensing 3000...");
                System.out.println("Remaining balance: 7000");
            }

        }else{
            System.out.println("Incorrect PIN. Card blocked.");
        }

        /*
         Key Things to Remember - 
        Conditions are checked top to bottom — order matters
        Always use .equals() for String comparison, never ==
        Ternary = short if/else for simple single-value decisions
        Switch is cleaner when checking one variable against many exact values
        The login + role check you wrote today is the exact logic Spring Security uses
        */
    }
}
