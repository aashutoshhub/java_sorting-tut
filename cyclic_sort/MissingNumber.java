import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
class MissingNumber {
    public static void main(String[] args) {
        int arr[]={4,0,1,2};
        int ans=missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
           int correctIndex=nums[i];
           if(nums[i]<nums.length && nums[i] != nums[correctIndex]){
              int temp=nums[i];
              nums[i]=nums[correctIndex];
              nums[correctIndex]=temp;
           }else{
            i++;
           }
        }

        //search for element   {0,1,2,4}
        for(int k=0;k<nums.length;k++){
            if(nums[k] != k){
               return k;
            }
           }

            //if element is sorted but (last) N is missing
            // like {0,2,1} but 3 is missing then it return 3
        return nums.length; 
        }

        

}
