public class varArgs {
    public static void main(String[] args){

        System.out.println(add(1,2,3,34,56,3));
    }
    static int add(int...arr){
        int sum = 0;
        for (int a: arr){
            sum += a;
        }
        return sum;
    }
}
