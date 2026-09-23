class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder a=new StringBuilder();

        int sum=0;
        for(int i=0;i<words.length;i++){
            sum=0;
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
            }
            char mappedChar = (char) ('z' - (sum % 26));
            a.append(mappedChar);        
        }return a.toString();
    }
}