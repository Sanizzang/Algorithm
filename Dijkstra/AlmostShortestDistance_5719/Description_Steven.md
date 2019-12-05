# Six Steps
> <br />
>
> ## Problem: [Almost shortest distance](https://www.acmicpc.net/problem/5719)
>
> ### 1. Understanding problem
>  A solver has to find almost shortest paths from the start to the destination. almost shortest path means the 
  shortest of the routes consisting of only roads not included in the shortest path group. 
> <br />
> <br />
> ### 2. Redefining a problem
>  Firstly, get rid of the shortest paths, after this find the shortest path. print out the distance of it.
> <br />
> <br />
> ### 3. Making a plan
>  My approaching is easy. #1 find shorest paths. #2 delete its routes to get to the destination form the start.
  #3 find shorest path and distance. #4 print out it.
> <br />
> <br />
> ### 4. Validate a plan
>  Basically, i gonna use dijkstra algorithm it should take O(N log N) which means it's enough to pass the problem :D
> <br />
> <br />
> ### 5. Implement
>  Here is my [first approaching](https://github.com/DevStevenLee/Algorithm/blob/master/Dijkstra/AlmostShortestDistance_5719/AlmostShortestDistance_5719_Steven.java) using Dijkstra
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

