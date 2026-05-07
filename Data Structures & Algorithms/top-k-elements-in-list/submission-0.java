class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n, 0)+1);
        }
        List<Map.Entry<Integer, Integer>> li = new ArrayList<>(m.entrySet());
        li.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        for(int i=0; i<k; i++){
            ans[i] = li.get(i).getKey();
        }
        return ans;
    }
}
