class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int len=operations.length;
        int ctr=0;
        for(int i=0;i<len;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                ctr++;
            }
            else{
                ctr--;
            }
        }
        return ctr;
    }
}
