#include<stdio.h>
int main()
{
    int N;// 설탕 무게
    int count=0;// 가져가야하는 봉지의 개수
    scanf("%d",&N);

    count=N/5;//입력받은 설탕의무게를 5로나누어 몫을 저장
    if (N%5 != 0)   //만약 5로 나누어떨어지지 않으면
    {
        for (; count>=0; count--)   //5로나눈 몫이 0보다 크거나 같을때까지 반복한다
        {
            if ((N-5*count)%3 == 0) //만약 설탕 무게에 5를count와 곱하고 N을 뺀후 3으로나눌수있고 나머지가 0이면 코드 실행
            {
                count+=(N-5*count)/3;//count에 3으로 나눌수있으면 count에 3으로나눌수있는 수를 더해준다
                break;
            }
        }   
    }
    printf("%d",count);
    return 0; 
    
}