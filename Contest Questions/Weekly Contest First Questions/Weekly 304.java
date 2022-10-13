class Solution {
    public int minimumOperations(int[] nums) {
       Set<Integer>mylst=new HashSet<>();
        for(int i:nums){
            if(i>0){
                mylst.add(i);
            }
        }
        int t=mylst.size();
        return t;
    }
}
