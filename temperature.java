import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit (C/F): ");

        unit = scanner.next().toUpperCase();

        System.out.println(temp);
        System.out.println(unit);

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("%.2°f%s", newTemp, unit);  //to type degree symbol use alt+0176

        scanner.close();
    }
}
