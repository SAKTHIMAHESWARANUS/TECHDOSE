#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int count[99]={0};
    
    for(int i=0;i<n;i++){
        count[arr[i]]++;
    }
   int max=0;
   for(int i=0;i<99;i++){
       if(max<count[i]){
           max=count[i];
       }
   }
   for(int i=0;i<99;i++){
       if(count[i]==max){
           printf("The Mode is %d \n",i);
       }
   }
   
    return 0;
}
