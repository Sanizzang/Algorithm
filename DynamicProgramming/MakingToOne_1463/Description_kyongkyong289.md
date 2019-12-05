# Six Steps
<br />

> ## Problem:[Making To One](https://www.acmicpc.net/problem/1463)
>
> ### 1. Understanding problem
> For a certain number of N, these three calculation can be done.  
> 1. Dividing N by 3 if N can be divided by 3.  
> 2. Dividing N by 2 if N can by divided by 2.  
> 3. Subtracting N by 1.  
> By using these three calculations, we need to make N to 1. Find at least number of calculations. 
> ### 2. Redefining a problem
> For N (1 <= N <= 1000000) find the least number of calculations to make 1. These calculations are  
> 1. Dividing N by 3 if N can be divided by 3.  
> 2. Dividing N by 2 if N can by divided by 2.  
> 3. Subtracting N by 1.
> ### 3. Making a plan
> We need to use Dynamic Programming. We are going to make a list which list[n] is minimum calculations to make n to 1.
> If n can be divided by 2, we need to compare list[n / 2] and list[n - 1].
> If n can be divided by 3, we need to compare list[n / 2] and list[n - 1].
> Else, list[n] is 1 + list[n - 1].
> ### 4. Validate a plan
> Time complexity is O(n), since 1 <= N <= 1000000, there is enough time to calculate.
> ### 5. Implement
> This is my first code using Dynamic Programming  
> [code](https://github.com/kyongkyong289/Algorithm/blob/master/DynamicProgramming/MakingToOne_1463/MakingToOne_1463_kyongkyong289.py)  
> (Version #1)
> ### 6. How it can be improved
>
>
>

