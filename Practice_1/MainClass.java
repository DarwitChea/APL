import java.util.ArrayList;

public class MainClass {
    public static void main(String[] ar)
    {
        Classroom object = new Classroom(// online);

        ArrayList<Student> students = new ArrayList<Student>();
        for(int i=0;i<3;i++)
        {
            Student newObject = new Student("Sample",2,5,8);
            students.add(newObject);
        }
        Classroom objectClassroom
                = new Classroom(
                        new Course(new Teacher
                                ("Samnang",10,"Java",11)),
                        students);
        Teacher objectTeacher = new Teacher("Samnang",10,"Java",11);
        Course objectCourse = new Course(objectTeacher);
        Classroom objectClassroom = new Classroom(objectCourse);
        System.out.print("Course name:"+objectClassroom.objectCourse.getCourseName()+"\n");
        System.out.print("Teacher name:"+objectClassroom.getTeacher().name+"\n");
        System.out.print("Average GPA:"+objectClassroom.getAverageGPA()+"\n");
    }
}
