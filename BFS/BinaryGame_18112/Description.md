# Six Steps
<br />

> ## Problem:[Binary Game](https://www.acmicpc.net/problem/18112)
>
> ### 1. Understanding problem
> For certain binary number, there can be three operations.  
> 1. Adding number by 1.  
> 2. Subtracting number by 1. If number is 0, abort it.  
> 3. Switching one digit to complementary number. (The front digit cannot be changed.)  
>
> Find at least number of operations which change the binary number L to K.
> ### 2. Redefining a problem
> For binary numbers L, K which digits are less than 10, find number of at least operations to make K from L.
> ### 3. Making a plan
> We can use breadth first search to solve this problem.
> We can define neighbor of N which are numbers that can be made by 1 operation.
> We can find neighbors of L and add neighbors which are not visited to queue.
> We can find distance which is 1 more than previous node.
> Then we can repeat this for all nodes in queue until we find K.
> ### 4. Validate a plan
> Time complexity is O(N * log(N)), because for all nodes N we have to find neighbors which is log(N).
> Since N is smaller than 1024, we have enough time to calculate.
> ### 5. Implement
> Here is my first code using BFS.  
> (kyongkyong289, Version #1, 2020-01-15)
> ### 6. How it can be improved
>

