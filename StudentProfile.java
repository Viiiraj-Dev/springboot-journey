public class StudentProfile {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 20;
        double GPA = 3.85;
        boolean isActive = true;
        char grade = 'A';
        
        System.out.println("---- Student Profile ----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("GPA     : " + GPA);
        System.out.println("Active  : " + isActive);
        System.out.println("Grade   : " + grade);

        System.out.println("\nIs Passing? : " + (GPA>2.0));
        System.out.println("To Uppercase: " + name.toUpperCase());
        System.out.println("Length: "+ name.length());

    }

    /*
    Key Things to Remember

    Java is strictly typed — always declare the type
    int for whole numbers, double for decimals, String for text, boolean for true/false
    % (modulus) gives the remainder — very useful for even/odd checks
    Strings are objects and have built-in methods like .length(), .toUpperCase(), .contains()
    Never skip the GitHub push — your commit history is your proof of work
    
    */
}
