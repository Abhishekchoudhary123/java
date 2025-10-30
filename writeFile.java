//import java.util.*;
import java.io.FileWriter;
public class writeFile {
    public static void main(String[] args) {
        // Code to write to a file would go here
        try(FileWriter writer = new FileWriter("test.txt")){
            writer.write("Hello, World! I am Abhishek Choudhary");
            System.out.println("Successfully wrote to the file.");

        }
        catch(Exception e ){
            System.out.println("An error occurred while writing to the file.");
        }
    }
}


// """
//         Abhishek
//         22
//         8.5
//         true
//         """;

// it is used to write multiple lines of text without using escape characters for new lines or quotes.