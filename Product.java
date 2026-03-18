public class Product{
    String name;
    String category;
    double price;
    int stock;

    //Constructor
    public Product(String name, String category, double price, int stock){
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    //Methods
    public void displayInfo(){
        System.out.println("-------------------");
        System.out.println("Product  : " + name);
        System.out.println("Category : " + category);
        System.out.println("Price    : " + price);
        System.out.println("Stock    : " + stock);
        System.out.println("Status   : " + getStatus());
    }

    public String getStatus(){
        return (stock>0) ? "In Stock" : "Out of Stock";
    }

    public double getDisountedPrice(double discountRate){
        return price - (price*discountRate);
    }

    public boolean isAvailable(){
        return stock > 0;
    }
}