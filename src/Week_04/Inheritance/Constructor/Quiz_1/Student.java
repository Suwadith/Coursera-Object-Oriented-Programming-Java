package Week_04.Inheritance.Constructor.Quiz_1;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student extends Person {

    public Student () {
        this("Student");
        System.out.println("#2 ");
    }

    public Student( String n )
    {
        super(n);
        System.out.println("#3 ");
    }
}