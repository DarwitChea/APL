public class Course {
    Teacher courseTeacher;

    public Course(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    String getCourseName()
    {
        return "Advance Application Programming";
    }
    Teacher getTeacher()
    {
        return courseTeacher;
    }
}
