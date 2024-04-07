public class Ten {
    public static int Ten(int a, int b){
        if(b == 0){
            return a;
        } else{
            return Ten(b, a%b);
        }
    }
    public static void main(String[] args){
        int a = 32;
        int b = 48;
        int result = Ten(a, b);
        System.out.println(result);
    }
}
