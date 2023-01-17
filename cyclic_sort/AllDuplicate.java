import java.util.*;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
class AllDuplicate {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};

    }
    private List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
             if( nums[i] !=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
             }else{
                i++;
             }
         }

         //search for index value 
        List<Integer> ans=new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            if(nums[k] != (k+1)){
              ans.add(nums[k]);
            }
        }

        return ans;
    
        
    }
}
