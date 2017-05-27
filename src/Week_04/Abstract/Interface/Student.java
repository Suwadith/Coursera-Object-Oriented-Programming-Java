package Week_04.Abstract.Interface;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student implements Person{

    @Override
    public void eat() {
        System.out.println("I eat Noodles");
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void sleep() {
        System.out.println("I go to bed at about 10 in the night");
    }
}
