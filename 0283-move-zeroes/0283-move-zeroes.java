
class Solution {
    public void moveZeroes(int[] nums){
        int b=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[b]=nums[i];
                b++;
            }
        }

        for(int i=b;i<nums.length;i++){
            nums[i]=0;
        }
    }
}

