import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class StringOnly extends Exception{
    public StringOnly(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {File file = new File("input.text"); // Create File object of filename "input.txt" in root directory
            String content = "Content to be written";
            if (!file.exists()) {
                file.createNewFile();
            } //Verify existence of file, if not, create new file
            FileWriter fw = new FileWriter(file);
            fw.write(content);

            Scanner myObj = new Scanner(System.in);

            System.out.print("Enter text to input: ");
            String text = myObj.nextLine();
            if(!text.matches("[a-zA-Z]+")) {
                throw new StringOnly("The text should contain string only.");
            }
            else{
                fw.write("\n" + text);
                fw.flush();
                fw.close();
            }
        } catch (IOException | StringOnly e) {
            System.out.println("An Error Occurred!");e.printStackTrace();
        }
    }
}