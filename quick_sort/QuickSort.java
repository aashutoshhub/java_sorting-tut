import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
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
        int pivot=arr[mid];  // {5,4,3,2,1} => pivot=3 

        while(s<=e){   //s=0 , e=4
            while(arr[s]< pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){   // 1,4,3,2,5  //s=1 and e=3  //1,2,3,4,5
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        //s,e=2
        quicksort(arr, low, e);    //1,2,3,4,5
        quicksort(arr, s, high);
    }
}
