import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONParser {
    public static void main(String[] args) {
//        Book[] book ={ new Book("A", "B", "C"),
//                new Book("A", "B", "C"),
//                new Book("A", "B", "C"),
//                new Book("A", "B", "C"),
//                new Book("A", "B", "C")};
//        WriteJSON(book,"Book.json");
////        ArrayList<Book> b = new ArrayList<Book>(Arrays.asList(ReadJSON()));  // Convert Array to arraylist
//        ArrayList<Book> b = ReadJSON();
//        for(int i=0;i<b.size();i++)
//        {
//            System.out.println(b.get(i).title + " " +  b.get(i).author + " " + b.get(i).isbn);
//        }

        Lecturer[] lecturers = {new Lecturer("Vichear","APL"),
                new Lecturer("Bunchun","Database")};
        Student[] students = {new Student("david",78),
                new Student("vireak",73),
                new Student("khoeline",74)};
        Room[] rooms = {new Room(001, lecturers, students),
        new Room(002,new Lecturer("Bunchun","Database"),students),
        new Room(003, lecturers,new Student("vireak",73) )};
//        WriteJSON(rooms,"Room.json");

        ArrayList<Room> b = new ArrayList<Room>(Arrays.asList(ReadJSON()));  // Convert Array to arraylist
        for(int i=0;i<b.size();i++)
        {
            Room room = b.get(i);
            System.out.println("\nRoom No." + b.get(i).roomNo + " ");
            System.out.print("Lecturer: ");

            for(int j=0 ;j<room.lectures.length;j++){
                System.out.print(b.get(i).lectures[j].name + " ");
            }

            System.out.print("\nSubject: ");
            for(int j=0 ;j<room.lectures.length;j++){
                System.out.print(room.lectures[j].subject + " ");
            }

            System.out.print("\nStudents: ");
            for(int k = 0; k<room.students.length;k++) {
                System.out.print(room.students[k].name + " ");
                System.out.print(room.students[k].score + ", ");
            }
        }
    }
    public static void WriteJSON(Room[] obj, String fileName)
    {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
//        String jsonBook = gson.toJson((Book[])obj);
//        try (FileWriter file = new FileWriter("book.json")) {
//            file.write(jsonBook);
//            file.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String jsonRoom = gson.toJson((Room[])obj);
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonRoom);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Room[] ReadJSON() {
//        Path path = Path.of("book.json");
//        String jsonString = "";
//        try {
//            jsonString = Files.readString(path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Gson gson = new GsonBuilder()
//                .create();
//        Type bookType = new TypeToken<ArrayList<Book>>(){}.getType();
//        ArrayList<Book> books = gson.fromJson(jsonString, bookType);
////        Book[] books = gson.fromJson(jsonString,Book[].class);
//        return books;

        Path path = Path.of("Room.json");
        String jsonString = "";
        try {
            jsonString = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new GsonBuilder()
                .create();

        Room[] rooms = gson.fromJson(jsonString,Room[].class);
        return rooms;
    }
}