public class Teacher extends Person {
    String subject;
    int yearsOfexperience;

    public Teacher(String name,
                   int age,
                   String subject,
                   int yearsOfexperience) {
        super(name, age);
        this.subject = subject;
        this.yearsOfexperience = yearsOfexperience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfexperience() {
        return yearsOfexperience;
    }

    public void setYearsOfexperience(int yearsOfexperience) {
        this.yearsOfexperience = yearsOfexperience;
    }
}
