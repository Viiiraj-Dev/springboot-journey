public class Day3 {
    public static void main(String[] args){
        //Exercise 1 — Grade Calculator
        int marks = 82;

        if (marks>=90){
            System.out.println("Grade A - Excellent!");
        }else if (marks>=75){
            System.out.println("Grade B - Good!");
        }else if (marks>=60){
            System.out.println("Grade C - Average!");
        }else if (marks>=50){
            System.out.println("Grade D - Below Average!");
        }else{
            System.out.println("Grade F - Failed");
        }

        // Exercise 2 — Login Simulation 
        String username = "admin";
        String password = "1234";
        boolean isLoggedIn = username.equals("admin") && password.equals("1234");

        if(isLoggedIn){
            System.out.println("✅ Login successful! Welcome, " + username);
        }else{
            System.out.println("❌ Invalid credentials. Access denied.");
        }

        // Exercise 3 — Switch for HTTP Status
        int statusCode = 404;

        switch(statusCode){
            case 200:
                System.out.println("Status " + statusCode + ": " + "OK — Request successful");
                break;
            case 201:
                System.out.println("Status " + statusCode + ": " + "Created — Resource created successfully");
                break;
            case 400:
                System.out.println("Status " + statusCode + ": " + "Bad Request — Check your input");
                break;
            case 401:
                System.out.println("Status " + statusCode + ": " + "Unauthorized — Please login");
                break;
            case 403:
                System.out.println("Status " + statusCode + ": " + "Forbidden — You don't have permission");
                break;
            case 404:
                System.out.println("Status " + statusCode + ": " + "Not Found — Resource doesn't exist");
                break;
            case 500:
                System.out.println("Status " + statusCode + ": " + "Internal Server Error — Server crashed");
                break;
            default:
                System.out.println("Unknown status code");
        }

    }
}
