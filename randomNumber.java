import java.util.Random;
public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        
        int number1;
        int number2;
        int number3;
        int number4;
        

        number1 = random.nextInt(1,3);
        number2 = random.nextInt();
        number3 = random.nextInt();
        number4 = random.nextInt();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}
