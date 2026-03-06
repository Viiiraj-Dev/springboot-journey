/*
### 🎯 Challenge — Product Inventory System (20 min)

Create `Inventory.java`. Build this **without copy-pasting:**
```
You have a store with 5 products:
- Names:   {"Laptop", "Phone", "Tablet", "Watch", "Earbuds"}
- Prices:  {75000, 45000, 30000, 15000, 5000}
- Stock:   {10, 0, 5, 8, 0}

Program should:
1. Print full inventory like this:
   --- Product Inventory ---
   1. Laptop    | Price: 75000 | Stock: 10  | Status: In Stock
   2. Phone     | Price: 45000 | Stock: 0   | Status: Out of Stock
   ...

2. Print total inventory value
   (sum of price * stock for each product)

3. Print count of out-of-stock products

4. Print the most expensive product name
*/

public class Inventory {
    public static void main(String[] args) {
        String[] names = {"Laptop", "Phone", "Tablet", "Watch", "Earbuds"};
        int[] prices = {75000, 45000, 30000, 15000, 5000};
        int[] stock = {10, 0, 5, 8, 0};
        int totalsum=0;
        int count = 0;
        int highestprc = prices[0];
        int mostexpensive=0;

        System.out.println("--- Product Inventory ---");
        for(int i=0; i<5; i++){
            String status = (stock[i]>0) ? "In Stock" : "Out of Stock";
            System.out.println(i + ". " + names[i] + " | Price: " + prices[i]+ " | Stock: " + stock[i] + " | Status: " + status);
            totalsum+=(prices[i]*stock[i]); 
            if(stock[i]==0) count++;
            if(prices[i]>highestprc){
                highestprc=prices[i];
                mostexpensive =i;
            }
        }

        System.out.println("\nTotal Inventory Value : ₹" + totalsum);
        System.out.println("Out of Stock Products : " + count);
        System.out.println("Most Expensive Product: " + names[mostexpensive]);

    }
    
}
