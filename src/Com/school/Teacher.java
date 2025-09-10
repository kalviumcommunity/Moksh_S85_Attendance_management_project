package Com.school;

public class Teacher extends Person {
    private String subjectTaught;

    // Constructor
    public Teacher(String name, String subjectTaught) {
        super(name);
        this.subjectTaught = subjectTaught;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject Taught: " + subjectTaught + ", Role: Teacher");
    }
}

