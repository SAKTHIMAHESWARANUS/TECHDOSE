#include <stdio.h>
#include <stdlib.h>
int GCD(int a,int b){
    if(a==0){
       return b;
    }
    else{
     return GCD(b%a,a);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    int y=GCD(a,b);
    int LCM=a*b/y;
    printf("%d",LCM);
    
    
}
