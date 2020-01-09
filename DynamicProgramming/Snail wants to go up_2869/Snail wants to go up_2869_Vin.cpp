#include<stdio.h>
int main()
{
    int A,B,V;
    int D=0;// save the day
    scanf("%d %d %d",&A,&B,&V);//2 1 5
    D = (V-B-1)/(A-B)+1;
    printf("%d",D);
    return 0;
}