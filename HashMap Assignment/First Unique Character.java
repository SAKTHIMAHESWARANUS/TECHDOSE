class Solution {
    public int firstUniqChar(String str) {
        int alpha[]=new int[127];
        int len=str.length();
        int index=0;
        for(int i=0;i<len;i++){
            alpha[str.charAt(i)]++;
        }
        int p=0;
        for(int i=0;i<len;i++){
            if(alpha[str.charAt(i)]==1){
                index=i;
                p=1;
                break;
            }
            alpha[str.charAt(i)]=0;
        }
        return p==1 ? index : -1;
    }
}
