class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int uq = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[uq]){
                uq++;
                nums[uq] = nums[i];
            }
        }
        int k = 0;
        for(int i=0; i<=uq; i++){
            if(nums[i] <= 0) continue;
            if(nums[i] != k+1) return k+1;
            else {
                k++;
            }
        }
        return k+1;
    }
}