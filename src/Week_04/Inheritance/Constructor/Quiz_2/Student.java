package Week_04.Inheritance.Constructor.Quiz_2;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student extends Person{

    // This would cause a Compilation Error if the Person class didn't have a no-args constructor
    public Student() {
        // Super(); // This line will be added by the compiler
        this.setName("Student");
        System.out.println("#4");
    }

}
