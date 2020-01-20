# Six Steps
<br />

> ## Problem:[KnightMove](https://www.acmicpc.net/problem/7562)
>
> ### 1. Understanding problem
> Find the minimum moves of knight when it moves start position to end position.
> ### 2. Redefining a problem
> For given three variables N, start, end which N is size of chessboard, start and end are pair of numbers.
> Start and end are position of starting point and ending point.
> Find the minimum moves of knight from start point to end point.
> ### 3. Making a plan
> We are going to use BFS to solve this problem.
> First, we are going to add starting point to queue.
> Second, we are going to find neighbors of first element of queue.
> (neighbors are knight's destinations which knight is moving once from certain point)
> Third, if neighbors are inside the board and if neighbors are not visited, find distances of neighbors.
> Fourth, add neighbors in queue.
> Fifth, repeat it until we find end point or queue is empty.
> ### 4. Validate a plan
> Time complexity is O(N ^ 4) since there are N ^ 2 nodes and each node, BFS takes time of O(N ^ 2).
> Since N is less than 300, we have enough time to calculate.
> ### 5. Implement
> Here is my first code using BFS.  
> (kyongkyong289, Version #1, 2020-01-20)
> ### 6. How it can be improved
> 