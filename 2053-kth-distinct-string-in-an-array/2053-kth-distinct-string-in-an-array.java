class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Boolean> a=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(a.containsKey(arr[i])){
                a.put(arr[i],false);
            }else{
                a.put(arr[i],true);
            }
        }
        for(String n:arr){
            if(a.get(n)==true){
            count++;
            if(count==k){
            return n;}}
        }return "";
    }
}