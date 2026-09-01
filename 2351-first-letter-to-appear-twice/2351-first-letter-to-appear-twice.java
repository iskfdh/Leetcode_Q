class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> a= new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(a.contains(s.charAt(i))){
                return s.charAt(i);
            }
            a.add(s.charAt(i));
        }
        return ' ';
    }
}