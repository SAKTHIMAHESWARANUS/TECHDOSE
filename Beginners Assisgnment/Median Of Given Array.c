#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        
    }
    printf("The median of given array:%d",n%2==0 ? ((n/2)+(n/2+1))/2 : n/2+1);
    
    
    return 0;
}
