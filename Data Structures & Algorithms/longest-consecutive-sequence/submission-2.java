class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int currC = 1;
        int maxC = 0;

        int uniq = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[uniq]){
                uniq++;
                nums[uniq] = nums[i];
            }
        }

        for(int j=0; j<=uniq-1; j++){
            if(nums[j+1] == nums[j]+1){
                currC++;
            }else {
                maxC = Math.max(maxC, currC);
                currC = 1;
            }
        }
        maxC = Math.max(maxC, currC);
        return maxC;
    }
}
