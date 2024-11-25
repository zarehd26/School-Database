package Teacher;

import java.util.ArrayList;

public class TeachersData {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    public TeachersData(ArrayList<Teacher> var1){
        this.teachers = var1;
    }
    public void addTeacher(){
        Teacher teacher  = new Teacher();
        teacher.enroll();
        teachers.add(teacher);
    }
    public void enroll(String id){
        int n = Integer.parseInt(id)-101;
        Teacher teacher = teachers.get(n);
        teacher.courseData();
        teacher.enroll();
    }
    public void displayTeacherCourses(String id) {
        int n = Integer.parseInt(id)-101;
        Teacher teacher = teachers.get(n);
        teacher.courseData();
        System.out.println("     Enrolled Courses     ");
        System.out.println("Course Code    Course Name");
        for (String i : teacher.registeredCourses()) {
            System.out.println(i + "           " + teacher.converter().get(i));
        }
    }
    public void showData(String id){
        int n = Integer.parseInt(id)-101;
        Teacher teacher = teachers.get(n);
        teacher.showTeacherInfo();
    }
}
