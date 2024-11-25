package Student;

import java.util.*;

public class StudentData {
    private ArrayList<Student> oneStudents ;
    private ArrayList<Student> twoStudents ;
    private ArrayList<Student> threeStudents ;
    private ArrayList<Student> fourStudents;

    public StudentData(ArrayList<Student> oneStudents,ArrayList<Student> twoStudents,ArrayList<Student> threeStudents,ArrayList<Student> fourStudents){
        this.oneStudents = oneStudents;
        this.twoStudents = twoStudents;
        this.threeStudents = threeStudents;
        this.fourStudents = fourStudents;

    }

    public void addStudent(){
        Student student = new Student();
        student.courseData();
        student.enroll();
        student.payBalance();
        String id = student.getId();
        char year = id.charAt(0);
        if(year=='1'){
            oneStudents.add(student);
        }
        else if(year=='2'){
            twoStudents.add(student);
        }
        else if(year=='3'){
            threeStudents.add(student);
        }
        else if(year=='4'){
            fourStudents.add(student);
        }
    }

    public void enroll(String id){
        Student st = null;
        char year = id.charAt(0);
        int n = Integer.parseInt(id.substring(1));
        if(year=='1'){
            st = oneStudents.get(n-1001);
        }
        else if(year=='2'){
            st = twoStudents.get(n-1001);
        }
        else if(year=='3'){
            st  = threeStudents.get(n-1001);
        }
        else if(year=='4'){
            st = fourStudents.get(n-1001);
        }
        st.courseData();
        st.enroll();
    }

    public void payFees(String id){
        Student st = null;
        char year = id.charAt(0);
        int n = Integer.parseInt(id.substring(1));
        if(year=='1'){
            st = oneStudents.get(n-1001);
        }
        else if(year=='2'){
            st = twoStudents.get(n-1001);
        }
        else if(year=='3'){
            st  = threeStudents.get(n-1001);
        }
        else if(year=='4'){
            st = fourStudents.get(n-1001);
        }
        st.payBalance();
    }
    public void displayCourses(String id) {

        Student st = null;
        char year = id.charAt(0);
        int n = Integer.parseInt(id.substring(1));
        if(year=='1'){
            st = oneStudents.get(n-1001);
        }
        else if(year=='2'){
            st = twoStudents.get(n-1001);
        }
        else if(year=='3'){
            st  = threeStudents.get(n-1001);
        }
        else if(year=='4'){
            st = fourStudents.get(n-1001);
        }
        st.courseData();
        System.out.println("     Enrolled Courses     ");
        System.out.println("Course Code    Course Name");
        for (String i : st.registeredCourses()) {
            System.out.println(i + "           " + st.converter().get(i));
        }
    }
    public void showData(String id){
        Student st = null;
        char year = id.charAt(0);
        int n = Integer.parseInt(id.substring(1));
        if(year=='1'){
            st = oneStudents.get(n-1001);
        }
        else if(year=='2'){
            st = twoStudents.get(n-1001);
        }
        else if(year=='3'){
            st  = threeStudents.get(n-1001);
        }
        else if(year=='4'){
            st = fourStudents.get(n-1001);
        }
        st.showInfo();
    }
}
