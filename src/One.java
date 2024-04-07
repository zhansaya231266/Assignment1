
public class One {
    public static int One(int[] a) {
        int min = a[0]; //initializing min

        for(int i=1; i<a.length; i++){ //iterating from 2 element
            if(a[i]<min){  //if the current element is less than min
                min = a[i]; //update min
            }
        }
        return min;  //return the value
    }

    public static void main(String[] args){
        int n = 5;
        int[] a = {10, 1, 32, 3, 45};
        int min = One(a);
        System.out.println("min:" + min);  //print the result
    }
}
