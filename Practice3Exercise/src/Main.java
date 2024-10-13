import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class Person{
        String name;
        int age;

        public Person(){};
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Student extends Person{
        int gradeLevel;
        double GPA;
        public Student(String name, int age,float GPA, int gradeLevel) {
            super(name, age);
        }

        public int getGradeLevel() {
            return gradeLevel;
        }

        public void setGradeLevel(int gradeLevel) {
            this.gradeLevel = gradeLevel;
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }
    }

    public static class Teacher extends Person{
        String subject;
        int yearExperience;

        public Teacher(String name, int age, String subject, int yearExperience) {
            super(name, age);
            this.subject = subject;
            this.yearExperience = yearExperience;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getYearExperience() {
            return yearExperience;
        }

        public void setYearExperience(int yearExperience) {
            this.yearExperience = yearExperience;
        }
    }

    public static class Course {
        Teacher courseTeacher;
        public Course(Teacher courseTeacher) {
            this.courseTeacher = courseTeacher;
        }

        String getCourseName(String course){
            return "Advanced Programing Language";
        }

        Teacher getTeacher(){
            return courseTeacher;
        }
    }

    public static class Classroom {
        Course objectCourse;
        ArrayList<Student> objStudent;

        public Classroom(Course objectcourse, ArrayList<Student> objStudent) {
            objectCourse = objectcourse;
            this.objStudent = objStudent;
        }

        public Classroom() {}

        float getAverageGPA()
        {
            float average =0f;
            for(int i=0;i<objStudent.size();i++)
            {
                average += objStudent.get(i).GPA;
            }
            return average/ objStudent.size();
        }
        Teacher getTeacher()
        {
            return objectCourse.courseTeacher;
        }
    }

    public static void main(String[] args) {

        Classroom object = new Classroom();

        ArrayList<Student> students = new ArrayList<Student>();
        for(int i=0;i<3;i++)
        {
            Student newObject = new Student("David",19,4,5);
            students.add(newObject);
        }

        Classroom objectClassroom
                = new Classroom(new Course(
                        new Teacher(
                                "Vichear",20,"APL",20)),students);

        System.out.print("Course name:"+objectClassroom.objectCourse.getCourseName("APL")+"\n");
        System.out.print("Teacher name:"+objectClassroom.getTeacher().name+"\n");
        System.out.print("Average GPA:"+objectClassroom.getAverageGPA()+"\n");

    }
}