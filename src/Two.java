public class Two {
    public static float Two(int n, int[] a) {
        float average = 0;  //initializing average
        for(int i=0; i<a.length; i++){  //iterating from 1 element
            average += a[i]; //sum of elements
        }
        average = average/n;  //average of elements
        return average; //return the value
    }
    public static void main(String[] args){
        int n = 4;
        int a[] = {3, 2, 4, 1};
        float average = Two(n, a);
        System.out.println(average);  //print the result

    }
}
