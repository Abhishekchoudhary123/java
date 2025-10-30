
import java.util.*;

public class aray{
    public static void main(String[] args) {
        
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        System.out.println("Fruits in the array:");
        Arrays.fill(fruits, "Grapes");
        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}

