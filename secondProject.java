
import java.util.Scanner;

public class secondProject{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest:  ");
        rate = scanner.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years the money is invested for: ");
        years = scanner.nextInt();

        amount =principal *Math.pow(1+(rate/timesCompounded), timesCompounded*years);
        System.out.printf("The amount after %d years is: %.2f", years, amount);
        
        


        scanner.close();
    }

}
