public class Teacher extends Person {
    private String subject;

    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    public void explain(){
        System.out.println("Explanation begins");
    }
}
