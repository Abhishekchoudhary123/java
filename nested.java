public class nested {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        //boolean isSenior   =  false;
        double price = 9.99;

        if(isStudent){
            System.out.println("You get a 20% discount");
            price = price * 0.8;
        }
        else{
            price = price * 1.0;
        }
        System.out.printf("The price is: %.2f " , price);
    }
}
