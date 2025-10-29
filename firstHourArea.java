// import java.util.Scanner;

// public class firstHourArea{
//     public static void main(String[] args){
//          Scanner scanner = new Scanner(System.in);
//          double width = 0;
//         double length = 0;
//         double area = 0;

//         System.out.print("enter width: ");
//         width = scanner.nextDouble();

//         System.out.print("enter length: ");
//         length = scanner.nextDouble();

//         area = width*length;

//         System.out.println(area + "cm²");

        

//         scanner.close();

  
//     }
// }


import java.util.Scanner;
public class firstHourArea{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double width;
        double length;
        double area;
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        area = width*length;
        System.out.println("Area is: "+ area +"cm²");
        scanner.close();

    }
}
