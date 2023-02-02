import java.util.Arrays;
public class Main
{
    public  static int[] createAnArray(){
        int size = (int) (Math.random()*15);
        int[] array = new int [size];
        for (int i=0; i<size;i++) {
            array[i] = (int) (Math.random()*30);
        }
         System.out.println(Arrays.toString(array));
         return array;
    }
    public static int getTarget(){
        return (int) (Math.random()*30);
    }
    
    public  static int indexSearch(int[]arr,int target) {
        for (int i =0; i<arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
      int target = getTarget();
      System.out.println("target : " +target);
     int result = indexSearch(createAnArray(),target);
     if (result != -1) System.out.println ("index of an element is " + result);
     else System.out.println("no such element in array");
     
    }
}
