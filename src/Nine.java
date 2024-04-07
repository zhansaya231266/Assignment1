public class Nine {
    public static int Nine(int n, int k){
        if(k == 0 || n == k){
            return 1; //k=0: C=1; n=k: C=1
        } else{
            return Nine(n-1, k-1) + Nine(n-1, k); //calculating binomial coefficient
        }
    }
    public static void main(String[] args){
        int n = 7;
        int k = 3;
        int result = Nine(n, k);
        System.out.println(result);
    }
}
