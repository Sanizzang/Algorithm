# Six Steps
<br />

> ## Problem:[Tetromino](https://www.acmicpc.net/problem/14500)
>
> ### 1. Understanding problem
> Tetrominos are 4 connected squares.
> For N x M tiles of paper, each 1 x 1 tile has number.
> Find the most sum of number which is under tetromino.
> ### 2. Redefining a problem
> For N x M tiles of paper, and number given in each tiles, (4 <= N, M <= 500)
> Find the most sum of number which is under tetromino.
> ### 3. Making a plan
> There are 19 kinds of tetrominos including fliping and rotating.  
> For each cases of tetromino, we will find the most number by moving tetromino from top-left to bottom-right.  
> This is kind of Brute Force.
> ### 4. Validate a plan
> Time complexity is O(N x M). since M, N are smaller than 500, we have enough time to calculate.
> ### 5. Implement
> Here is my first code using Brute Force.  
> [Code](https://github.com/kyongkyong289/Algorithm/blob/kyongkyong289/Brute_Force/Tetromino_14500/Tetromino_14500_kyongkyong289.py)  
> (kyongkyong289, Version #1, 2019-12-18)
> ### 6. How it can be improved
>
>
>

