
public class Main {
    public static int One(int[] a) {
        int min = a[0];

        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int n = 5;
        int[] a = {10, 1, 32, 3, 45};
        int min = One(a);
        System.out.println("min:" + min);
    }
}