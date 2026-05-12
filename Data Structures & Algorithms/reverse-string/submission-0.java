class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n-1;

        for(i=0; i<n/2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            j--;
        }
    }
}