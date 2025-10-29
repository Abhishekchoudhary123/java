import java.util.Scanner;
public class flop {
    public static void main(String[] args) {
        // For loop to print numbers from 1 to 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to print up to: "
        );
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
