
import java.util.Arrays;
public class InsertionPlusMin {

    public static int findmin (int[]a) {
        int min = a[0];
        for (int i =1;i<a.length;i++) {
            if (a[i]<min)
                min = a[i];
        }
        return min;
    }

     public static void insertSort(int[]a) {
        for (int i =1; i< a.length; i++) {
             int key = a[i];
             int j = i-1;
             while (j>=0 && a[j]>key) {      // 
                a[j+1] = a[j];
                j--;
             }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
         int [] array = {2,-5,16,4,8,8,29,0,-3};
         
         System.out.println(findmin(array));
         insertSort(array);
         System.out.println(Arrays.toString(array));
    }

    }
   
