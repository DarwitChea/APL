import java.util.ArrayList;

public class Classroom {
    Course objectCourse;
    ArrayList<Student> objectStudent;

    Classroom(Course objectCourse,ArrayList<Student> objectStudent)
    {
        this.objectCourse= objectCourse;
        this.objectStudent = objectStudent;
    }
    Classroom(String url)
    {
        this.objectCourse= objectCourse;
        this.objectStudent = objectStudent;
    }

    float getAverageGPA()
    {
        float average =0f;
        for(int i=0;i<objectStudent.size();i++)
        {
            average += objectStudent.get(i).GPA;
        }
        return average/ objectStudent.size();
    }

    Teacher getTeacher()
    {
        return objectCourse.courseTeacher;
    }

}
