import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class redFile{
    public static void main(String[] args) {
        String filePath =  "rFile.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find  locate file");
        }
        catch(Exception e){
            System.out.println("An error occurred while reading the file.");
        }
    }
}