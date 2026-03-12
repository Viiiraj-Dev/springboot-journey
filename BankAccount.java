/*
### 🎯 Challenge — Bank Account System (20 min)

Create `BankAccount.java`. Build a simple bank system **using methods** — no copy-pasting:
```
Create these methods:

1. printHeader(String accountHolder)
   → prints "Account Holder: John | Account No: ACC-001"

2. boolean isValidAmount(double amount)
   → returns false if amount <= 0

3. double deposit(double balance, double amount)
   → if valid amount: print "Deposited: X" return new balance
   → else print "Invalid deposit amount" return same balance

4. double withdraw(double balance, double amount)
   → if invalid amount: print "Invalid amount"
   → if amount > balance: print "Insufficient funds"
   → else: print "Withdrawn: X" return new balance

5. void printBalance(double balance)
   → prints "Current Balance: ₹X"

6. String getAccountStatus(double balance)
   → balance > 10000  : return "Premium Account"
   → balance > 1000   : return "Standard Account"
   → else             : return "Low Balance — Please deposit"

In main():
- Start with balance = 5000
- Deposit 3000
- Withdraw 1000
- Withdraw 15000 (should fail)
- Withdraw -500  (should fail)
- Print final balance
- Print account status
*/

public class BankAccount {
    public static void printHeader(String accountHolder){
        System.out.println(accountHolder);
    }

    public static boolean isValidAmount(double amount){
        if(amount<=0){
            return false;
        }
        return true;
    }

    public static double deposit(double balance, double amount){
        if(isValidAmount(amount)){
            System.out.println("Deposited: " + amount);
            return (balance + amount);
        }
        System.out.println("Invalid deposit amount");
        return balance;
    }

    public static double withdraw(double balance, double amount){
        if(!(isValidAmount(amount))){
            System.out.println("Invalid amount");
            return balance;
        }else if(amount > balance){
            System.out.println("Insufficient funds");
            return balance;
        }
        System.out.println("Withdrawn: " + amount);
        return balance - amount;
    }

    public static void printBalance(double balance){
        System.out.println("Current Balance: ₹" + balance);
    }

    public static String getAccountStatus(double balance){
        if(balance > 10000){
            return "Premium Account";
        }else if(balance > 1000){
            return "Standard Account";
        }
        else{
            return "Low Balance — Please deposit";
        }
    }

    public static void main(String[] args) {
        double balance = 5000;
        balance = deposit(balance, 3000);
        balance = withdraw(balance, 1000);
        balance = withdraw(balance, 15000);
        balance = withdraw(balance, -500);
        printBalance(balance);
        getAccountStatus(balance);
        
    }

    
}
