# Six Steps
<br />

> ## Problem:[Danji](https://www.acmicpc.net/problem/2667)
>
> ### 1. Understanding problem
> There is a square map, 1 is house and 0 is empty, a group of connected house is called danji.
> Connected means there is another house at left or right or up or down of the house.
> Find number of danji and find number of houses of danji in ascending order.
> ### 2. Redefining a problem
> For given number N (5 <= N <= 25), and map which rows and columns are N,
> Find number of danji and number of houses of danji in ascending order.
> ### 3. Making a plan
> We need to use BFS several times.
> for every unvisited house, we have to use BFS.
> During BFS, we need to make adjacent houses visited and count number of houses in danji.
> And if one BFS is finished then we have to return list of visited houses so we don't need to do BFS in visited houses.
> ### 4. Validate a plan
> Time complexity is O(N ^ 4) since number of nodes are N ^ 2. since N is smaller than 25, we have enough time to calculate.
> ### 5. Implement
> Here is my first code using BFS.  
> [code](https://github.com/DevStevenLee/Algorithm/blob/master/BFS/Danji_2667/Danji_2667_kyongkyong289.py)  
> (kyongkyong289, Version #1, 2020-02-04)
> ### 6. How it can be improved
>

