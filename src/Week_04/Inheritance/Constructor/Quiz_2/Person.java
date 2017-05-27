package Week_04.Inheritance.Constructor.Quiz_2;

/**
 * Created by suwad on 5/27/2017.
 */
public class Person {

    private String name;

    public Person(){
        System.out.println("#1");
    }

    public Person( String n ) {
        super();
        this.name = n;
        System.out.println("#2");
    }
    public void setName( String n ) {
        this.name = n;
        System.out.println("#3");
    }

}
