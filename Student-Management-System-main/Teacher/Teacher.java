import java.util.*;

public class Teacher {
    private String firstName;
    private String lastName;
    private int teacherId;
    private int id=101;
    private int salary;
    private ArrayList<String> enrolledCourses = new ArrayList<>();
    
    private HashMap<String, String> codeToName = new HashMap();
    private HashMap<String, Integer> codeToFees = new HashMap();

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
    public Teacher(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        this.firstName = sc.next();
        System.out.print("Enter the Last Name: ");
        this.lastName = sc.next();
        setTeacherId();
        this.salary=0;
    }
    private void setTeacherId(){
        teacherId = id;
        id++;
    }

    public void enroll() {
        Admin ad = new Admin();
    
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
                salary+=(codeToFees.get(courseCode)-1000);
                ad.totalExpenditure+=(codeToFees.get(courseCode)-1000);
            }
        } while (1 != 2);
    }
    public ArrayList<String> registeredCourses(){
        return enrolledCourses;
    }
    public HashMap<String,String> converter(){
        return codeToName;
    }
    public void showTeacherInfo(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("id: "+teacherId);
        System.out.println("Salary: "+salary);
        System.out.println("     Enrolled Courses     ");
        System.out.println("Course Code    Course Name");
        for (String i : enrolledCourses) {
            System.out.println(i + "           " + codeToName.get(i));
        }
    }


}
