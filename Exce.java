import java.util.*;
public class Exce {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        try{
             System.out.print("Enter a number: ");
             int number = scanner.nextInt();
             System.out.println(number);
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
        // catch(InputMismatchException e){
        //     System.out.println("Please enter a valid integer.");
        // }
        catch(Exception e){
            System.out.println("An unexpected error occurred: " );
        }

        finally{
            scanner.close();
        }
        
    }
}
