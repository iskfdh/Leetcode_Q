class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);

        }
HashMap<Integer,Integer> map = new HashMap<>();
int index=1;
for(int x: set) map.put(x,index++);
for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
  return arr;}
}