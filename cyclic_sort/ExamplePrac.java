import java.util.Arrays;

class ExamplePrac {
    public static void main(String[] args) {
        int arr[]={4,3,2,5,1};
        cyclicsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicsort(int[] arr, int length) {
        
        int i=0;
        while(i<length){
            int correctIndex=arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp;
        temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
        
    }
}
