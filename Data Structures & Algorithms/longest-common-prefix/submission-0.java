class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        Arrays.sort(strs, (a, b) -> a.length()-b.length());
        int maxLen = strs[0].length();
        for(int j=0; j<maxLen; j++) {
            for(int i=0; i<strs.length; i++) {
                if(strs[i].charAt(j) != strs[0].charAt(j)) return pre;
            }
            pre += strs[0].charAt(j);
        }
        return pre;
    }
}