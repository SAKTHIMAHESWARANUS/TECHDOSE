import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j>0;j--){
		        if(arr[j]<arr[j-1]){
		            int tep=arr[j];
		            arr[j]=arr[j-1];
		            arr[j-1]=tep;
		        }
		    }
		}
		for(int i : arr){
		    System.out.println(i+" ");
		}
		
	}
}
