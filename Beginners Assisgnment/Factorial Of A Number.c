#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d",&n);
    if(n==0 || n==1){
        printf("1");
    }
    else{
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        printf("The factorial is:%d",fact);
    }
    
    return 0;
}
