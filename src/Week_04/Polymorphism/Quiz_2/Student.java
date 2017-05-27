package Week_04.Polymorphism.Quiz_2;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student extends Person {
    public void method1() {
        System.out.print("Student 1 ");
        super.method1();
        method2();
    }
    public void method2() {
        System.out.print("Student 2 ");
    }
}
