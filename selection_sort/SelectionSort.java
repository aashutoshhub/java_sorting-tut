import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {

        
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
        int maxIndex=findMaxIndex(arr,0,last);

        swap(arr,maxIndex,last);  
        }
    }

    private static void swap(int[] arr, int first, int second) {
        
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;     
    }
}
