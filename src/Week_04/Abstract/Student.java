package Week_04.Abstract;

/**
 * Created by suwad on 5/27/2017.
 */
public class Student extends Person{

    @Override
    public void eat() {
        System.out.println("I eat Pizza");
    }

    @Override
    public void speak() {
        System.out.println("I speak English");
    }

}
