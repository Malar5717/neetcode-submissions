class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('@').append(s);
        }
        String str = sb.toString();
        return str;
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        int dig = 0;
        for(int i=0; i<str.length(); i++){
            while(str.charAt(i) != '@'){
                if(Character.isDigit(str.charAt(i))){ 
                    dig = dig*10 + Character.getNumericValue(str.charAt(i));
                }
                i++;
            }
            li.add(str.substring(i+1, i+dig+1));
            i = i+dig;
            dig = 0;
        }
        return li;
    }
}
