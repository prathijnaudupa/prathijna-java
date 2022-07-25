import java.util.Arrays;
import java.util.Collections;
 
class Small {
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 6,1,3,9,7,8 };
        int k = 4;
        System.out.print("4'th smallest element is " + kthSmallest(arr, k));
    }
}
 