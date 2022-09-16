
import java.util.*;

class Main
{
    public static int factorial(int n){
        int p=1;
        for(int i=1;i<=n;i++){
            p*=i;
        }
        return p;

    }
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int net=factorial(n);
		int ret=factorial(r);
		int nr=factorial(n-r);
		int de=ret*nr;
		System.out.println("nCr value is: "+net/de);
	}
}
