public class Ten {
    public static int Ten(int a, int b){
        if(b == 0){
            return a; // b=0: GCD(a, b) = a
        } else{
            return Ten(b, a%b); //Euclidean Algorithm
        }
    }
    public static void main(String[] args){
        int a = 32;
        int b = 48;
        int result = Ten(a, b);
        System.out.println(result);
    }
}
