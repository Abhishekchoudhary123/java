import java.util.Scanner;
public class weightConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("Weight Coversion Program");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter weight in Pounds: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in Kilograms: %.2f kg", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter weight in Kilograms: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("Weight in Pounds: %.2f lbs", newWeight);
        }
        else{
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
