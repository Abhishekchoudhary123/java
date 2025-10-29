import java.util.Scanner;
public class wLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        while(age < 0 ){
            System.out.println("Invalid age. Please enter a valid age between 0 and 120: ");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }     
        System.out.println("Your age is: " + age + " years.");  
        scanner.close();  

    }
}
