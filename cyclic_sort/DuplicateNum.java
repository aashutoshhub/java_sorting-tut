class DuplicateNum {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int i=0;
    while(i<nums.length){
        if(nums[i] != i+1){
            int correctIndex=nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else{
                return nums[i];
            }
        }else{
            i++;
        }
     }

      return -1;
    }



    }

