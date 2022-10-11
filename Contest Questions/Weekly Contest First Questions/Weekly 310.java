class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        int l=nums.length;
        
        for(int i=0;i<l;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int max=0;
        int[] arr=new int[l];
        int al=0;
        
        for(int i:map.keySet()){
            if(i%2==0){
                if(map.get(i)>max){
                    max=map.get(i);
                }
            }
        }
        
        for(int i:map.keySet()){
            if(map.get(i)==max && i%2==0){
                arr[al++]=i;
            }
        }
        
         for(int i=0;i<al;i++){
            for(int j=i+1;j<al;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(al==0) return -1;
        return arr[0];
    }
}
