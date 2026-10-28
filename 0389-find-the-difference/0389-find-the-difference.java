class Solution {
    public char findTheDifference(String s, String t) {
        int sc=0;
        int tc=0;
        for(int i=0;i<s.length();i++)
        sc+=s.charAt(i)-'a';
        for(int i=0;i<t.length();i++)
        tc+=t.charAt(i)-'a';
        return (char)(tc-sc+'a');
    }
}