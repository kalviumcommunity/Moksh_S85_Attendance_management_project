package Com.school;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Student[] students = new Student[4];

        students[0] = new Student();
        students[0].setDetails(1, "Moksh");
        students[1] = new Student();
        students[1].setDetails(2, "MS");

        Course[] courses = new Course[2];

        courses[0] = new Course();
        courses[0].setDetails(501, "OPPS");

        courses[1] = new Course();
        courses[1].setDetails(502, "Full Stack");


        System.out.println("Student Details:");
        for (Student s : students) {
            if(s!=null){
                s.displayDetails();
            }

        }


        System.out.println("Course Details:");
        for (Course c : courses) {
            if(c!=null){
                c.displayDetails();

            }
        }
    }
}