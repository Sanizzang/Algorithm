> #Six Steps
> <br />
>
> ## Problem: [Walk With Beer 9205](https://www.acmicpc.net/problem/9205)
>
> ### 1. Understanding problem
>  Sang-guen wanna get to the rock festival. he gonna carry 20 beers to drink it while walking.
  he drinks it at 50 meters. therefore, he should have more beers to buy in a market. when he buys
  some beers, only he can have 20 beers maximum. here is the mission that Sang-guen can get to the point with beers 
  which of is not short.
> <br />
> <br />
> ### 2. Redefining a problem
>  Find out the path which of distance is not longer than 1000 to get to the market where human (x) can buy some beers.
  so Let's define a set of paths as graph G. and i gonna define the destination as D also each vertax called V.
  if this expression is formulated, find the path which of every distance of G(V1) to G(V2) always under 1001 to D.
> <br />
> <br />
> ### 3. Making a plan
>  First of all, think of this map as the graph. check out each a distance of a path is under 1001 by using DFS skill.
  if human (X) can get to the point, print out "happy". it is not, print out "sad"
> <br />
> <br />
> ### 4. Validate a plan
>  A number of places in the problem is N+2 (0 <= N <= 100). DFS visits vertax only one times so time complexity should be
  O(N) enough to pass the problem :)
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching for [Walk With Beer 9205](https://github.com/DevStevenLee/Algorithm/blob/master/DFS/WalkWithBeer_9205/WalkWithBeer_9205.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

