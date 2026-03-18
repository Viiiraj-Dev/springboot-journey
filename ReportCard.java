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

public class ReportCard {
    public static void main(String[] args) {
        Student s1 = new Student("Vir", 101, new int[]{85, 90, 88, 92, 87});
        Student s2 = new Student("Raj", 101, new int[]{70, 65, 72, 68, 75});
        Student s3 = new Student("Zaid", 101, new int[]{45, 50, 40, 55, 48});

        s1.displayReport();
        s2.displayReport();
        s3.displayReport();

        Student[] stds = {s1, s2, s3};
        Student topper = stds[0];
        for(Student std : stds){
            if(std.getAverage()> topper.getAverage()){
                topper = std;
            }
        }
        System.out.println("");

        System.out.println("🏆 Topper: " + topper.name
                + " with average: " + topper.getAverage());

    }
    
}
