public class Student extends Person {
    float GPA;
    int gradeLevel;

    public Student(String name,
                   int age,
                   float GPA,
                   int gradeLevel) {
//        super(name, age);
        this.name = name;
        this.age = age;

        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
