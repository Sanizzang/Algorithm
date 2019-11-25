# Six Steps
<br />

> ## Problem: [Sudoku 2580](https://www.acmicpc.net/problem/2580)
>
> ### 1. Understanding problem
>  Given N a number of queen and the board size (N x N). Count the paths of queens that doesn't attack 
  each other.  
> <br />
> <br />
> ### 2. Redefining a problem
>  Assume that B(x, y) is the position x, y of the board, another one is k (0 <= k < (x, y)). 
  Required axiom here is the only one queen placing on row. so it doesn't need to check over the row where 
  the queen gonna place. Let's assume that B(x - k >= 0, y - k >= 0), B(x + k < N, y - k >= 0) and 
  B(x, y - k >= 0) doesn't have queen is the predicate P. if P is true, then B(x, k) can be placed 
  with the queen. the mission is counting when P is true N times.
> <br />
> <br />
> ### 3. Making a plan
>  Try every combinations by placing a queen on the position when P is ture. when it reaches out to N, count
  one. print out acmmulated count for the result. 
> <br />
> <br />
> ### 4. Validate a plan
>  It gonna take O(N!) because, it used with backtracking skill to make every combinations.
  here n is in range of (1 <= 0 < 15). it's actually big. but maybe it will be able to pass the problem.
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

