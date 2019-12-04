# Six Steps
<br />

> ## Problem:[Sugar Delivery](https://www.acmicpc.net/problem/2839)
>
> ### 1. Understanding problem
> There are packs of 3kg and 5kg sugar. find at least number of total packs to make Nkg of sugar
> <br />
> <br />
> ### 2. Redefining a problem
> For N (3 <= N <= 5000), find at least value of a + b which satisfies 3a + 5b = N. a and b must be integer.
> <br />
> <br />
> ### 3. Making a plan
> We should use Dynamic Programming to solve this problem.
> We can make a list which list[n] is minimum packs of sugar.
> Since 8, 9, 10kg of sugar is possible, all weights same or more than 8kg is possible.
> We make list[0] to list[7] and make it recursive for same or more than 8kg
> Since (n - 3)kg and (n - 5)kg are minimum_guaranteed, nkg which is chosen by minimun of (n - 3)kg and (n - 5)kg is also minimum.
> <br />
> <br />
> ### 4. Validate a plan
> The time complexity is O(n) since N <= 5000, this is enough time to calculate.
> <br />
> <br />
> ### 5. Implement
>
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>