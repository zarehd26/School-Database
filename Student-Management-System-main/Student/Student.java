package Student;

import java.util.*;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private double tutionBalance;
    private static int oneId = 1001;
    private static int twoId = 1001;
    private static int threeId = 1001;
    private static int fourId = 1001;
    private HashMap<String, String> codeToName = new HashMap<>();
    private HashMap<String, Integer> codeToFees = new HashMap<>();
    private ArrayList<String> enrolledCourses = new ArrayList<>();

    // Enter the data of Courses
    public int year() {
        return gradeYear;
    }

    public String id() {
        return studentId;
    }

    public void courseData() {
        codeToName.put("1001", "Data Structures and Algorithms");
        codeToFees.put("1001", 6000);
        codeToName.put("1002", "Operating Systems");
        codeToFees.put("1002", 4500);
        codeToName.put("1003", "Computer Networks");
        codeToFees.put("1003", 8000);
        codeToName.put("1004", "Artificial Intelligence");
        codeToFees.put("1004", 10000);
        codeToName.put("1005", "Machine Learning");
        codeToFees.put("1005", 7500);
        codeToName.put("1006", "Deep Learning");
        codeToFees.put("1006", 9500);
        codeToName.put("1007", "Design and Analysis");
        codeToFees.put("1007", 3000);
        codeToName.put("1008", "Computer Organisation");
        codeToFees.put("1008", 8000);
    }

    // Constructor to enter Student name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Year  - 1\nSecond Year - 2 \nThird Year  - 3 \nFourth Year - 4");
        System.out.print("Grade: ");
        this.gradeYear = sc.nextInt();
        System.out.print("First Name: ");
        this.firstName = sc.next();
        System.out.print("Last Name: ");
        this.lastName = sc.next();
        setStudentId();
    }

    public String getId(){
        return this.studentId;
    }

    // generate a 6 digit id for a student
    private void setStudentId() {
        // GradeLevel+Id for unique values
        if (gradeYear == 1) {
            studentId = gradeYear + "" + oneId;
            oneId++;
        }
        if (gradeYear == 2) {
            studentId = gradeYear + "" + twoId;
            twoId++;
        }
        if (gradeYear == 3) {
            studentId = gradeYear + "" + threeId;
            threeId++;
        }
        if (gradeYear == 4) {
            studentId = gradeYear + "" + threeId;
            fourId++;
        }
    }

    // Enroll in the courses
    public void enroll() {
        do {
            System.out.print("Enter the course code to Enroll, \"Quit\" to quit: ");
            Scanner sc = new Scanner(System.in);
            String courseCode = sc.next();
            if (courseCode.equalsIgnoreCase("quit"))
                break;
            if (!codeToName.containsKey(courseCode)) {
                System.out.println("Enter a Valid Course Code");
            } else if (enrolledCourses.contains(courseCode)) {
                System.out.println(codeToName.get(courseCode) + " is already Enrolled.");
            } else {
                enrolledCourses.add(courseCode);
                tutionBalance += codeToFees.get(courseCode);
                
            }
        } while (1 != 2);

    }

    public void displayCourses() {
        System.out.println("     Enrolled Courses     ");
        System.out.println("Course Code    Course Name");
        for (String i : enrolledCourses) {
            System.out.println(i + "           " + codeToName.get(i));
        }
    }
    public ArrayList<String> registeredCourses(){
        return enrolledCourses;
    }

    public HashMap<String,String> converter(){
        return codeToName;
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your Fees Balance is " + tutionBalance);
    }

    // Pay Tution
    public void payBalance() {
        Admin ad = new Admin();
        viewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        if (amount >= tutionBalance) {
            tutionBalance = 0;
            ad.totalEarnings+=tutionBalance;
            System.out.println("Thanks for your complete payment of " + tutionBalance + " rupees");
        } else {
            tutionBalance -= amount;
            ad.totalEarnings+=amount;
            System.out.println("Thanks for your payment of " + amount + " rupees");
            System.out.println("Your Remaining Balance is " + tutionBalance);
        }
        
    }

    // Show Status
    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Grade Year: " + gradeYear);
        System.out.println("Student Id: " + studentId);
        displayCourses();
        System.out.println("Balance: " + tutionBalance);
    }

}
