package Week_04.Polymorphism.Quiz_1;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student extends Person{

    public Student(String name)  {
        super(name);
    }

    public boolean isAsleep( int hr ) // override
    { return 2 < hr && 8 > hr; }

}
