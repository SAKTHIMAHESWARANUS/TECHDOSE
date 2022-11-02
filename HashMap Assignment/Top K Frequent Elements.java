class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> mylist=new ArrayList<>();
        for(Map.Entry<Integer,Integer> name : map.entrySet()){
            mylist.add(name.getValue());
        }
        Collections.sort(mylist,Collections.reverseOrder());
        int arr[]=new int[k];
        int index=0;
        HashMap<Integer,Integer>nmap=new LinkedHashMap<>();
        for(int i:mylist){
             for(Map.Entry<Integer,Integer> name : map.entrySet()){
                  if(name.getValue()==i){
                       nmap.put(name.getKey(),name.getValue());
                  }
              }
        }
        for(Map.Entry<Integer,Integer>vadak :nmap.entrySet()){
            arr[index++]=vadak.getKey();
            if(index==k) return arr;
        }
        System.out.print(nmap);
        return arr;
    }
}
