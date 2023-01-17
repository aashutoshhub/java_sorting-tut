
import java.util.Arrays;

class MergeSortInPlace {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void  mergesort(int[] arr,int s,int e) {
        if(e-s==1){
            return;
        }

        int mid=(s+e)/2;

        mergesort(arr,s,mid);
        mergesort(arr,mid,e);

        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s,int mid,int e) {
      int mix[]=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }


        //if first array is larger than second then simply insert remaining into array
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        
        //if second array is larger than first then simply insert remaining into array 
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        
        for(int n=0;n<mix.length;n++){
            arr[s+n]=mix[n];
        }
    }
}
