class Solution {
    public String frequencySort(String s) {
        int arr[]=new int[128];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder a=new StringBuilder();
        while (a.length()<s.length()){
            int max=0;
            for(int i=0;i<128;i++){
                if(arr[i]>arr[max])
                max=i;
            }
            for(int i=0;i<arr[max];i++){
                a.append((char)max);
            }
            arr[max]=0;
        }
        return a.toString();
    }
}