import java.util.Arrays;

class CyclicSort {
  public static void main(String[] args) {
    int arr[]={4,3,2,5,1};
    sorting(arr);
    System.out.println(Arrays.toString(arr));
  }

private static void sorting(int[] arr) {
    int i=0;
    while(i<arr.length){
        int correctIndex=arr[i]-1;
        if(arr[i] != arr[correctIndex]){
            swap(arr,i,correctIndex);
        }else{
            i++;
        }
    }
}

private static void swap(int[] arr, int i, int correctIndex) {
    int temp=arr[i];
    arr[i]=arr[correctIndex];
    arr[correctIndex]=temp;
}    
}
