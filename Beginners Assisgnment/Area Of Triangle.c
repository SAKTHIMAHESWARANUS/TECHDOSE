#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main()
{
    float x1,y1,x2,y2,x3,y3;
    scanf("%f %f\n%f %f\n%f %f",&x1,&y1,&x2,&y2,&x3,&y3);
    float co1=sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    float co2=sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
    float co3=sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
    float side =(co1+co2+co3)/2;
    printf("%.2f",sqrt(side*(side-co1)*(side-co2)*(side-co3)));
    return 0;
    
    
    
}
