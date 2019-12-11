# Six Steps
<br />

> ## Problem:
>
> ### 1. Understanding problem
> For a given value N, find number of cases of making N by adding 1, 2, and 3.
> ### 2. Redefining a problem
> For a given value N, (1 <= N <= 10) find number of cases of making N by adding 1, 2, and 3.
> ### 3. Making a plan
> We need to use dynamic programming to solve this problem.  
> The cases of making N is divided by three cases. Let F(N) cases of making N.  
> 1) F(N) = 1 + F(N - 1)  
> 2) F(N) = 2 + F(N - 2)  
> 3) F(N) = 3 + F(N - 3)  
> Since these three cases are independent, The cases of making N can be added. So, cases of making N is  
> F(N) = F(N - 1) + F(N - 2) + F(N - 3) for n >= 4.  
> Cases of making 1, 2, 3 is 1, 2, 4.
> ### 4. Validate a plan
> Time complexity is O(N). Since N is less than 11, We have enough time to claculate.
> ### 5. Implement
>
> ### 6. How it can be improved
>
>
>


