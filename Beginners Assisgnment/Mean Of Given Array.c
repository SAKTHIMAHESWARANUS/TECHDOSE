#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[n];
    int sum=0;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    printf("The mean of given array:%d",sum/n);
    
    
    return 0;
}
