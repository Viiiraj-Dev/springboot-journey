public class Day2{
    public static void main(String[] args){
       //Exercise 1 — Declare and print all data types (5 min)
       //Primitive Types
       int age = 22;
       long worldPopulation = 8000000000L;
       double salary = 100000.50;
       boolean isEmployed = true;
       char grade = 'A';

       //Reference type
       String name = "Vir Dev";

       //Print them all
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("World Popukation: " + worldPopulation);
       System.out.println("Salary: " + salary);
       System.out.println("Employeed: " + isEmployed);
       System.out.println("Grade: " + grade);


       //Exercise 2 — Arithmetic
       int x = 20;
       int y = 6;

       System.out.println("Add: " + (x+y));
       System.out.println("Subtract: " + (x-y));
       System.out.println("Multiply: " + (x*y));
       System.out.println("Divide: " + (x/y));
       System.out.println("Remainder: " + (x%y));

       //Is number even or odd?
       System.out.println("Is x even? " + (x%2==0));
       System.out.println("Is y even? " + (y%2==0));

       // Exercise 3 — String Operations
       String firstName = "Spring";
       String lastName = "Boot";
       String fullName = firstName + " " + lastName;

       System.out.println("Full Name: " + fullName);
       System.out.println("Length: " + fullName.length());
       System.out.println("Uppercase: " + fullName.toUpperCase());
       System.out.println("Lowercase: " + fullName.toLowerCase());
       System.out.println("Has 'Spring'? " + fullName.concat("Spring"));
       System.out.println("Replaced: " + fullName.replace("Boot", "Developer"));

    }
}