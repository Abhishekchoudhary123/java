public class searchAray {
    public static void main(String[] args) {
        
       int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       int target = 70;

       for(int num: numbers){
           if(num == target){
               System.out.println("Found the target number: " + target);
               return;
           }
       }

    }
}