# Six Steps
<br />

> ## Problem:[DisassembleAndSum](https://www.acmicpc.net/problem/2231)
>
> ### 1. Understanding problem
> For a natural number N, disassemble sum is sum of N and digits of N.  
> For example, 245's diassemble sum is 245 + 2 + 4 + 5 = 256. Then, we can say 245
> is constructor of 256.  
> For a given N, find the least constructor of N. If it doesn't exist, print 0.
> ### 2. Redefining a problem
> For a given number N(1 <= N <= 1000000), find the least number which sum of number and digits of number is N.  
> If it doesn't exist, print 0.
> ### 3. Making a plan
> We can solve it by using brute force.  
> We can add number and digits of number. The number is from 1 to N.  
> If constructor doesn't exist from 1 to N, then we can print 0.
> ### 4. Validate a plan
> Time complexity is probably(N \* log(N)). Since N is less than 1000000, we have enough time to calculate.
> ### 5. Implement
> Here is my code using brute force.  
> [code](https://github.com/kyongkyong289/Algorithm/blob/kyongkyong289/Brute_Force/DisassembleAndSum_2231/DisassembleAndSum_2231_kyongkyong289.py)  
> (kyongkyong289, Version #1, 2019-12-29)
> ### 6. How it can be improved
>
>
>

