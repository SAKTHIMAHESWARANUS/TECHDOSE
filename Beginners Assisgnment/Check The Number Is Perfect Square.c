
#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        if(i*i==n){
            printf("THE NUMBER IS PERFECT SQUARE");
            return 0;
        }
    }
    printf("THE GIVEN NUMBER IS NOT PERFECT SQUARE");

    return 0;
}
