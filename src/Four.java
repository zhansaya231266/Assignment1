public class Four {
    public static int Four(int n){
        if(n==0){ // checking if n is 0. 0!=1
            return 1;
        } else{
            return n * Four(n-1); //returning value of factorial
        }
    }

    public static void main(String[] args){
        int n = 5;
        int result = Four(n);
        System.out.println(result);
    }
}
