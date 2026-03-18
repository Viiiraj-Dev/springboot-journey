/*
### 🎯 Challenge — Student Report Card (20 min)

Create `Student.java` and `ReportCard.java` — **without copy-pasting:**
```
Student class should have:
- Fields: name, rollNumber, marks (int array of 5 subjects)
- Constructor: takes name, rollNumber, marks array
- Methods:
  1. getTotalMarks()     → sum of all marks
  2. getAverage()        → average of all marks
  3. getGrade()          → A(>=90) B(>=75) C(>=60) D(>=50) F(<50)
  4. isPass()            → true if average >= 50
  5. displayReport()     → prints full report card like:
  
  ====== Report Card ======
  Name        : Viraj
  Roll No     : 101
  Total Marks : 430 / 500
  Average     : 86.0
  Grade       : B
  Result      : PASS
  =========================

ReportCard main class:
- Create 3 students with different marks
- Display all report cards
- Print who got the highest average 
*/

public class Student {
    //Fields
    String name;
    int rollNumber;
    int[] marks;

    //Constructor
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Methods
    public int getTotalMarks(){
        int sum = 0;
        for(int mark : marks){
            sum+=mark;
        }
        return sum;
    }

    public double getAverage(){
        return (double)  getTotalMarks()/marks.length;
    }

    public String getGrade(){
        double avg = getAverage();
        if(avg>=90){
            return "A";
        }else if(avg>=75){
            return "B";
        }else if(avg>=60){
            return "C";
        }else if(avg>=50){
            return "D";
        }else{
            return "F";
        }
    }

    public boolean isPass(){
        return (getAverage()>=50) ? true: false;
    }

    public void displayReport(){

        System.out.println("====== Report Card ======");
        System.out.println("Name        : " + name);
        System.out.println("Roll No     : " + rollNumber);
        System.out.println("Total Marks : " + getTotalMarks());
        System.out.println("Average     : " + getAverage());
        System.out.println("Grade       : " + getGrade());
        String Result = (isPass())?"PASS":"FAIL";
        System.out.println("Result      : " + Result);
        System.out.println("=========================");

    }


    
    
}
