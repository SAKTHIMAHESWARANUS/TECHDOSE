class Solution {
    public int fillCups(int[] amount) {
     Arrays.sort(amount);
        if(amount[2]==0) return 0;
        if(amount[1]==0) return amount[2];
        else{
            amount[1]-=1;
            amount[2]-=1;
            return 1+fillCups(amount);    
        }
     }
}
	
