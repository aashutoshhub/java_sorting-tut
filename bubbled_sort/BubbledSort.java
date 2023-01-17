import java.util.Arrays;

class BubbledSort {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,5};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
       boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                //swap 
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            if(!swapped){  // !true=false or !false=true and break
                break;
            }
        }

        
       
        
    }
}
