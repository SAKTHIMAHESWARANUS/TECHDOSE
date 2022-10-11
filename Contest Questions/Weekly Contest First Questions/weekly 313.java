class Solution {
    public int commonFactors(int a, int b) {
        int ctr=0;
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                ctr++;
            }
        }
        return ctr;
    }
}
