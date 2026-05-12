class Solution {
    public int removeElement(int[] nums, int val) {
        int u = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            }else {
                nums[u] = nums[i];
                u++;
            }
        }
        return u;
    }
}