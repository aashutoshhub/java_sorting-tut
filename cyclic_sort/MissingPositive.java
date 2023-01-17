 class MissingPositive {
    public static void main(String[] args) {
        
    }

    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
          int correctIndex=nums[i]-1;
          if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correctIndex]){
              int temp=nums[i];
              nums[i]=nums[correctIndex];
              nums[correctIndex]=temp;
          }else{
             i++;
          }
        } 
 
        //searching the first missing positive number
       for(int k=0;k<nums.length;k++){
         if(nums[k] != k+1){
             return k+1;
         }
       }
 
       return nums.length+1;
 
     }
}
