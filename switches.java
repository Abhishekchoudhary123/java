import java.util.Scanner;
public class switches {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");

        String day = scanner.nextLine();

        switch(day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday 😊");
                break;
            default:
                System.out.println("non day");

                
        }
        scanner.close();

    }
}
