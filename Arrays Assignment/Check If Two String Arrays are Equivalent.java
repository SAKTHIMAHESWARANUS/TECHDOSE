class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ch="";
        for(int i=0;i<word1.length;i++){
            ch+=word1[i];
        }
        String gh="";
        for(int i=0;i<word2.length;i++){
            gh+=word2[i];
        }
    return ch.equals(gh);
    }
}
