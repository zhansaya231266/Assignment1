public class Two {
    public static float Two(int n, int[] a) {
        float average = 0;
        for(int i=0; i<a.length; i++){
            average += a[i];
        }
        average = average/n;
        return average;
    }
    public static void main(String[] args){
        int n = 4;
        int a[] = {3, 2, 4, 1};
        float average = Two(n, a);
        System.out.println(average);

    }
}
