
public class Three {
    public static String Three(int n){

        for(int i = 2; i<=n; i++){  //checking divisibility from 2
            if(n%i==0){   //if n is divisible by any number, it is not Prime
                return "Composite";
            }
        }

        return "Prime";//if no divisor, n is Prime
    }
    public static void main(String[] args){
        int n = 7;
        String result = Three(n);
        System.out.println(result);
    }
}
