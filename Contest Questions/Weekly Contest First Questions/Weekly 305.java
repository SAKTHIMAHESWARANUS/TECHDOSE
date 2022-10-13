class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> mylst=new HashSet<>();
        for(int i:nums){
            mylst.add(i);
        }
        int ctr=0;
        for(int i:mylst){
            if(mylst.contains(i+diff) && mylst.contains(i+diff*2)){
                ctr++;
            }
        }
        return ctr;
    }
}
