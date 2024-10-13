package XMLParser;

import java.util.ArrayList;
import java.util.Arrays;

public class Friend {
    private int id;
    private String name;
    private int age;
    private String description;
    private ArrayList<String> phoneNumbers;

    public Friend(int id, String name, int age, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
        this.phoneNumbers = new ArrayList<>();
    }

    public Friend() {
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Friend index = " + (id-1) +
                "\nid= " + id +
                "\nname= " + name +
                "\nage= " + age +
                "\ndescription= " + description  +
                "\nphoneNumbers= " + phoneNumbers;
    }
}

