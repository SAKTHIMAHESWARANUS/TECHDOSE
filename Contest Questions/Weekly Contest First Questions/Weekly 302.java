class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[2];
        arr[0]=0;
        arr[1]=1;
        int len=nums.length;
        if(len==1) return arr;
        Set<Integer> mylst=new HashSet<Integer>();
        int ctr=0;
        int c[]=new int[2];
        for(int i:nums){
            if(mylst.contains(i)){
                mylst.remove(i);
                ctr++;
            }
            else{
                mylst.add(i);
            }
        }
        
        c[0]=ctr;
        c[1]=mylst.size();
        return c;    
    }
}
