import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Person person = new Person(20);
       person.greet();

       Student hayk = new Student(21);
       hayk.greet();
        System.out.println(hayk.getAge());

       Teacher ethan = new Teacher(28 , "English");
       ethan.greet();
       ethan.explain();

    }
}






