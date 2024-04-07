public class Five {
    public static int Five(int n){
        if(n <= 1){ //checking if n is 0 or 1
            return n;
        } else{
            return Five(n-1) + Five(n-2); //returning Fibonacci value
        }
    }
    public static void main(String[] args){
        int n = 17;
        int result = Five(n);
        System.out.println(result);
    }
}
