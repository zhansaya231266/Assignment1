public class Six {
    public static int Six(int a, int n){
        if(n == 0){ //checking if n is 0. a raised to the power 0 is always 1.
            return 1;
        } else{
            return a * Six(a, n-1); //calculating a raised to the power n
        }

    }
    public static void main(String[] args){
        int a = 2;
        int n = 10;
        int result = Six(a,n);
        System.out.println(result);
    }
}
