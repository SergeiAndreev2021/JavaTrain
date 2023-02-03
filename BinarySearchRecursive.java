
//============================== RETURNS THE INDEX OF AN ELEMENT FROM A SORTED ARRAY ===================

public class BinarySearch{  
  
       public static int searcher(int key, int[] array){
            Arrays.sort(array);
            int low = 0;
            int high = array.length-1;
           return search(key,array,low,high);
        }
        
    public static int search(int key, int[] array, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low)/2;
        if (key> array[mid])  return search(key,array, mid+1,high);
        else if (key<array[mid]) return  search(key,array, low,mid-1);
        else return mid;
    }
  
    public static void main(String[] args) {
    int [] array = {2,4,18,35,40,50, 66,70,25,61,-7,11};
    int z = searcher(2,array);
       System.out.println(z);
    }
}
