package Week_04;

/**
 * Created by Suwadith on 5/26/2017.
 */
public class Main {

    public static void main(String[] args){

        Person p = new Person();
        Student s = new Student();
        Person q = new Person();
        Faculty f = new Faculty();
        Object o = new Faculty();

        String n = s.getName(); // works fine because s is a student object and Student is a child class of Person.
        p = s; // This works fine because you can say that all the students can be referred by a person object.
        int m = p.getID(); // This won't work because Person class doesn't have a getID method. But you can cast it and make it work.
        int m = ((Student)p).getID(); // This is how you cast and fix the above error
        f = q; // This gives an error because you can't say that all person object should belong to a faculty Object.
        o = s; // This works fine because all the object references are children of the Object type.

    }

}
