class Solution {
    public String reverseWords(String s) {
        StringBuilder a=new StringBuilder();
        String[] ans=s.split(" ");
        for(String word:ans){
            a.append(new StringBuilder(word).reverse());
            a.append(" ");
        }a.deleteCharAt(s.length());
        return a.toString();
    }
}