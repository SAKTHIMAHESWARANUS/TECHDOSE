
import java.util.*;

class main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++){
		    int g=0;
		    for(int j=2;j<i;j++){
		        if(i%j==0){
		            g=1;
		            break;
		        }
		    }
		    if(g==0){
		        System.out.print(i+" ");
		    }
		}
	}
}
