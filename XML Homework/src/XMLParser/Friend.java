package XMLParser;

import java.util.Arrays;

public class Friend {

    public int index;
    public int id;
    public String name;
    public int age;
    public String description;
    public String[] phonenumbers;

    public Friend(int index, int id, String name, int age, String description, String[] phonenumbers) {
        this.index=index;
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
        this.phonenumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "Friend index = " + index +
                "\n\tID =" + id +
                "\n\tName = " + name +
                "\n\tAge = " + age +
                "\n\tDescription= " + description +
                "\n\t" + (phonenumbers[0]) +
                "\n\t" + (phonenumbers[1]) + "\n";
    }
}

