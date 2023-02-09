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
		int index=0;
		for(;index<arr.length;){
		    int crt=arr[index]-1;
		    if(arr[crt]!=arr[index]){
		        int temp=arr[crt];
		        arr[crt]=arr[index];
		        arr[index]=temp;
		    }
		    else{
		        index++;
		    }
		}
		System.out.print(Arrays.toString(arr));
		
	}
}
