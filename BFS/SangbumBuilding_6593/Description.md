> #Six Steps
> <br />
> 
> ## Problem: [SangbumBuilding 6593](https://www.acmicpc.net/problem/6593)
>
> ### 1. Understanding problem
>  Find the fastest way to escape from Sangbum building. the human confined in the building can move one step
  to up, down, east, west, south, north at once. Sadly, he can not go though any wall. If he can escpae, 
  then print out Escaped in x minute(s). else he can't escpae, then print out Trapped!
> <br />
> <br />
> ### 2. Redefining a problem
>  Find the fastest way to escape. x(human) can move P[p-1], P[p+1] to 6 directions. 
> <br />
> <br />
> ### 3. Making a plan
>  Simply, use BFS skill to traverse every vertax P. when it detects to E, it can escape. or it can't detects
  it can not escape.
> <br />
> <br />
> ### 4. Validate a plan
>  A number of level of the building is L(1 <= L <= 30). a number of row of the building is R(1 <= R <= 30). 
  a number of column of the building is C(1 <= C <= 30). we just use BFS so it should be O(N). it's about
  27000 enough to pass the problem.
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching for [SangbumBuilding 6593](https://github.com/DevStevenLee/Algorithm/blob/master/DFS/SangbumBuilding_6593/SangbumBuilding_6593.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

