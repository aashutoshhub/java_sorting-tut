

class SetMismatch {
    public static void main(String[] args) {
        
    }

    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
           int correctIndex=nums[i]-1;
           if(nums[i] != nums[correctIndex]){
              int temp=nums[i];
              nums[i]=nums[correctIndex];
              nums[correctIndex]=temp;
           }else{
            i++;
           }
        }

        //search for element 
        for(int k=0;k<nums.length;k++){
            if(nums[k] != k+1){
               return new int[] {nums[k],k+1};
            }
           }

            //if element is sorted but (last) N is missing
            // like {0,2,1} but 3 is missing then it return 3
        return new int[] {-1,-1}; 
    }
}
