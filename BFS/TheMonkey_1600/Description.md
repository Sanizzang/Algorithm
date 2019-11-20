# Six Steps
<br />

> ## Problem: [The Monkey 1600](https://www.acmicpc.net/problem/1600)
>
> ### 1. Understanding problem
>  There is the monkey that wanna be a horse. this monkey makes a decision impulsively that follows a horse movement in chess.
  but this monkey can only move like a horse K times. after this, it can move horizontally and vertically.
  find the minimum movements of the monkey from the top left to the bottom right.
> <br />
> <br />

> ### 2. Redefining a problem
>  Let's assume that this monkey is M, the start is S, the destination is D. Also, define some symbols below for the problem.
>> 1. Movement of horse is h (0 <= h <= 30) <br />
>> 2. Movement of monkey is k (0 <= k <= infinite) <br />
>
> therefore, all k, h (- N : find the minimum movements M(h) + M(k) from S to D.
> <br />
> <br />

> ### 3. Making a plan
>  Let's try all of cases by using BFS. when it traverses into the graph, it needs to go next M(h) or M(k)
  but don't move like h over than over than 30. Also, the minimum movement can't be predicated what exatly
  the position we need to move like M(h) or M(K) such that the monkey get to the point faster than any other.  
  so Let's assume that visited[row][col][K] is checking the mark for row, column and espeically how many times it moves like
  horse with k. when it get to the destination, print out it.
> <br />
> <br />

> ### 4. Validate a plan
>  To use BFS skill, it should be O(n^2(size of the map)) is enough to pass the problem :D.
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

