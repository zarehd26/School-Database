import java.util.*;

public class Admin {
    protected int totalEarnings;
    protected int totalExpenditure;

        public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        ArrayList<Student> firstYear = new ArrayList<>();
        ArrayList<Student> secondYear = new ArrayList<>();
        ArrayList<Student> thirdYear = new ArrayList<>();
        ArrayList<Student> fourthYear = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        StudentData data = new StudentData(firstYear, secondYear, thirdYear, fourthYear);
        TeachersData tdata = new TeachersData(teachers);
        do{
            System.out.println("Enroll a Student - 1"+
            "\nEnroll Multiple Students - 2"+
            "\nEnroll a Student Course - 3"+
            "\nDisplay a Student Courses - 4"+
            "\nPay Student fees - 5"+
            "\nShow Student Info - 6"+
            "\nEnroll a Teacher - 7"+
            "\nEnroll Multiple Teachers - 8"+
            "\nEnroll a Teacher Course - 9"+
            "\nDisplay the Teacher Enrolled Courses - 10"
            );
            System.out.print("Enter a command: ");
            int command = sc.nextInt();
            if(command==1){
                data.addStudent();
            }
            else if(command==2){
                System.out.println("Enter the number of Students: ");
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    data.addStudent();
                }
            }
            else if(command==3){
                System.out.print("Enter the Student Id: ");
                String id = sc.next();
                data.enroll(id);
            }
            else if(command==3){
                System.out.print("Enter the Student Id: ");
                String id = sc.next();
                data.displayCourses(id);
            }
            else if(command==5){
                System.out.print("Enter the Student Id: ");
                String id = sc.next();
                data.payFees(id);
            }
            else if(command==6){
                System.out.print("Enter the Student Id: ");
                String id = sc.next();
                data.showData(id);
            }
            else if(command==7){
                tdata.addTeacher();
            }
            else if(command==8){
                System.out.println("Enter the number of Teachers: ");
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    tdata.addTeacher();
                }
            }
            else if(command==9){
                System.out.print("Enter the Teacher Id: ");
                String id = sc.next();
                tdata.enroll(id);
            }
            else if(command==10){
                System.out.print("Enter the Teacher Id: ");
                String id = sc.next();
                tdata.displayTeacherCourses(id);
            }
        }while(1!=2);
    }
}
