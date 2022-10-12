import java.util.*;
class Solution {
    public static  List<Integer> intersection(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;
        int alpha[]=new int[1001];
        List<Integer> mylst=new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<nums[i].length;j++){
                alpha[nums[i][j]]++;
            }
        }
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]==r){
                mylst.add(i);
            }
        }
        
        return mylst;
        
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mat[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        List<Integer> s=new ArrayList<Integer>();
        s=intersection(mat);
        int si=s.size();
        for(int i:s) System.out.print(i+" ");
        
       
    }
}
