import java.util.ArrayList;

public class Person {
    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        age = age;
    }
}
class Student extends Person{
    public Integer gradeLevel;
    public double gpa;

    public Student(String name, Integer age, Integer gradeLevel, double gpa) {
        super(name, age);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
class Teacher extends Person{
    public String subject;
    public Integer yearOfExperience;

    public Teacher(String name, Integer age, String subject, Integer yearOfExperience) {
        super(name, age);
        this.subject = subject;
        this.yearOfExperience = yearOfExperience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(Integer yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }
}
class Course{
    public String nameOfCourse;
    public Teacher teachers;

    public Course(String nameOfCourse, Teacher teachers) {
        this.nameOfCourse = nameOfCourse;
        this.teachers = teachers;
    }

    public String getCourseName() {
        return nameOfCourse;
    }

    public Teacher getTeacher() {
        return teachers;
    }
}
class Classroom{
    public Course course;
    public ArrayList<Student> students;

    public Classroom(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }
    public double getAverageGPA(){
        double avgGPA ,sumGPA= 0;

        for (int i = 0; i < students.size(); i++) {
            Student obj = students.get(i);
            sumGPA += obj.getGpa();
        }
        avgGPA = sumGPA / (students.size());

        return avgGPA;
    }

    public String getCourse() {
        return course.getCourseName();
    }

    public Teacher getTeacher(){
        return course.getTeacher();
    }
    public static void main(String[] args) {
        Teacher vireak = new Teacher("Vireak",20,"APL",3);
        ArrayList<Student> students = new ArrayList<Student>(3);
        Student nyvath = new Student("Nyvath",18,2,3.8);
        Student david = new Student("David",19,2,3.5);
        Student khoelin= new Student("Khoelin",20,2,3.4);
        Student nalis= new Student("Nalis",19,2,3.5);
        students.add(nyvath);
        students.add(david);
        students.add(khoelin);
        students.add(nalis);
        Course apl = new Course("APL",vireak);
        Classroom classroom = new Classroom(apl,students);
        System.out.println("course name "+classroom.getCourse());
        System.out.println("teacher name "+classroom.getTeacher().getName());
        System.out.println("average GPA "+classroom.getAverageGPA());
    }
}



