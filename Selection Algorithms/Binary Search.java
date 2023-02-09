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
		int target=sc.nextInt();
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		while(l<r){
		    int mid=l+(r-l)/2;
		    if(arr[mid]==target){
		        System.out.print(mid);
		        break;
		    }
		    else if(arr[mid]<target){
		        l=mid+1;
		    }
		    else{
		        r=mid-1;
		    }
		}
		//System.out.print("-1");
		
	}
}
