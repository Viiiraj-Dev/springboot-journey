public class Day4{
    public static void main(String[] args){

        //Exercise 1 — Loop Basics
        //Multiplication table of 5
        System.out.println("--- Multiplication Table of 5 ---");
        for(int i=1; i<=10; i++){
            System.out.println("5 X " + i + " = " + (5*i));
        }

        // Sum of 1 to 100
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum+=i;
        }
        System.err.println("\nSum of 1 to 100: " + sum);

        // Exercise 2 — Array Operations
        //Student marks array
        int[] marks = {85, 92, 78, 95, 88, 73, 90};

        int total =0;
        int highest = marks[0];
        int lowest = marks[0];

        for(int mark: marks){
            total+=mark;
            if(mark>highest) highest = mark;
            if(mark<lowest) lowest=mark;
        }
        double average = (double) total/marks.length;
        System.out.println("\n--- Student Marks Report ---");
        System.out.println("Total Students : " + marks.length);
        System.out.println("Total Marks    : " + total);
        System.out.println("Average        : " + average);
        System.out.println("Highest        : " + highest);
        System.out.println("Lowest         : " + lowest);

        // Exercise 3 — Login Retry with while
        //Login retry system
        String correctPassword = "java123";
        String[] attempts = {"wrong1", "wrong2", "java123"};
        int maxAttempts = 3;
        boolean loggedIn = false;
        int i =0;

        while(i<maxAttempts){
            if(attempts[i].equals(correctPassword)){
                loggedIn = true;
                System.out.println("✅ Login successful on attempt " + (i + 1));
                break;
            }else{
                System.out.println("❌ Wrong password. Attempt " + (i + 1));
            }
            i++;
        }
        if(!loggedIn){
            System.out.println("🔒 Account locked after " + maxAttempts + " attempts.");
        }
    }
}

/*
Key Things to Remember

Arrays are zero-indexed — arr[0] is the first element
for → when you know how many times to repeat
while → when you repeat until a condition changes
for-each → cleanest way to loop through arrays/lists
break exits the loop, continue skips to next iteration
In Spring Boot — every list of data from a database gets looped through exactly like this
*/