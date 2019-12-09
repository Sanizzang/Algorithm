# Six Steps
<br />

> ## Problem:[2 x N Tiling](https://www.acmicpc.net/problem/11726)
>
> ### 1. Understanding problem
> For given N, find number of cases of filling 2 x N space with 2 x 1 and 1 x 2 tiles.
> ### 2. Redefining a problem
> For a given N, (1 <= N <= 1000), find number of cases of filling 2 x N space with horizontal and vertical 2 x 1 tiles.
> ### 3. Making a plan
> We can use dynamic programming for this problem.
> For 2 x N space we can split into two cases.  
> 1) 2 x N spaces = vertical 1 x 2 tile + 2 x (N - 1) spaces.  
> 2) 2 x N spaces = 2 x horizontal 2 x 1 tiles vertically + 2 x (N - 2) spaces.  
> Since two cases are independent, we can simply add cases 2 x (N - 1) and 2 x (N - 2) spaces.  
> Let's define cases of 2 x N tiles f(N), then  
> f(1) = 1  
> f(2) = 2  
> f(N) = f(N - 1) + f(N - 2) for N >= 3    
> And then, we can finally use dynamic programming.
> ### 4. Validate a plan
> The time complexity is O(N), this means we have enough time to calculate.
> ### 5. Implement
> Here is my first code using dynamic programming.  
> [code](https://github.com/kyongkyong289/Algorithm/blob/kyongkyong289/DynamicProgramming/2xNTiling_11726/2xNTiling_11726_kyongkyong289.py)  
> (kyongkyong289, Version #1, 2019-12-09)
> ### 6. How it can be improved
>
>
>

