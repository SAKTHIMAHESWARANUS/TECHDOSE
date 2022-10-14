class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res=0;
        List<Integer> mylst=new ArrayList<Integer>();
        for(int i:nums1){
            mylst.add(i);
        }
        for(int i:nums2){
            mylst.add(i);
        }
        Collections.sort(mylst);
        
        int len=mylst.size();
        if(len%2!=0){
            res=mylst.get(len/2);
        }
        else{
            res=(mylst.get(len/2)+mylst.get((len/2)-1))/2.0;
            System.out.print((mylst.get(len/2)+" "+mylst.get((len/2)-1)));
        }
        return res;
        
    }
}
