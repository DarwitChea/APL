package Model;

import java.util.ArrayList;

public class Student {
    public String name;
    public int attendance;
    public int ID;
    public ArrayList<Subject> subject;

    public Student(String name, int attendance, int ID, ArrayList<Subject> subject) {
        this.name = name;
        this.attendance = attendance;
        this.ID = ID;
        this.subject = subject;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname= " + name +
                "\nattendance= " + attendance +
                "\nID= " + ID +
                "\nsubject= " + subject +
                "\n}\n";
    }
}
