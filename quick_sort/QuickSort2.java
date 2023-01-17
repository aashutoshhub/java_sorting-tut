import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,6};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];


        //to check with pivot and swap
        while(s<=e){
            
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp; 
                s++;
                e--;
            }                   // {5,2,3,4,6}
        }

        //now for sub-arrays to be sort
      
        quicksort(arr, low, e);      // {5,2,3,4,6}  // low=0 and e=2  //doesn't include 2 index
        quicksort(arr, s, high);     // {5,2,3,4,6}  // s=2 and high
    }
}


/*
   steps to approach
  
   1.set pivot element (any (recomended mid))
   2.compare left side and swap || same with right side 
   3.sort the left sub-array and right sub-array
   4.done

 */
