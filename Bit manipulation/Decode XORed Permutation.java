class Solution {
    public int[] decode(int[] encoded) {
        int len = encoded.length;
        int[] res = new int[len+1];
        res[0] = len/2%2==0 ? 1 : 0;
        for(int i=1; i<len; i+=2)
            res[0]^=encoded[i];
        for(int i=0; i<len; i++)
            res[i+1] = res[i]^encoded[i];
        return res;
    }
}
