public class Room {
    int roomNo;
    Lecturer[] lectures;

    Lecturer lecturer;
    Student[] students;
    Student student;

    public Room(int roomNo, Lecturer[] lectures, Student[] students) {
        this.roomNo = roomNo;
        this.lectures = lectures;
        this.students = students;
    }
    public Room(int roomNo, Lecturer lecture, Student[] students) {
        this.roomNo = roomNo;
        this.lecturer = lecture;
        this.students = students;
    }
    public Room(int roomNo, Lecturer[] lectures, Student students) {
        this.roomNo = roomNo;
        this.lectures = lectures;
        this.student = students;
    }
}
