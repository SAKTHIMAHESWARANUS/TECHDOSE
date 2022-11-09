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
	    while(index<arr.length){
	        int crt=arr[index]-1;
	        if(arr[index]!=arr[crt]){
	            swap(arr,index,crt);
	        }
	        else{
	            index++;
	        }
	    }
	    for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
	}
	public static void swap(int arr[],int ind,int crt){
	    int temp=arr[ind];
	    arr[ind]=arr[crt];
	    arr[crt]=temp;
	}
}
