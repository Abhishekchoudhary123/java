public class logical {
   public static void main(String[] args) {
    double temp = 10;
    boolean isSunny = true;
    if (temp > 20 && isSunny) {
        System.out.println("It's a warm and sunny day!");
    } else if(temp <= 30 && temp >= 0 && !isSunny) {
        System.out.println("The weather is GOOD");
        System.out.println("It's a bit chilly or not sunny.");
        
    }
    else if(temp > 30 && temp >= 0 || !isSunny){
        System.out.println("The weather is BAD");
        System.out.println("It is cloudty outside");
    }
   }
}