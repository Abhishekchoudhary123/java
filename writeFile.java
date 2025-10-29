import java.util.*;
import java.io.FileWriter;
public class writeFile {
    public static void main(String[] args) {
        // Code to write to a file would go here
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("Hello, World!");
            System.out.println("Successfully wrote to the file.");

        }
        catch(Exception e ){
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
