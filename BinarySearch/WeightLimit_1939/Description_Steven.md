# Six Steps
<br />

> ## Problem: [Weight limit 1939](https://www.acmicpc.net/problem/1939)
>
> ### 1. Understanding problem
>  There are islands of which the number is 2 <= N <= 10,000. also, bridges connecting some islands exist.
  many things have to be delivered through the brideges that have the specific weight limit. therefore, if weight of
  a stuff is heavier than the weight limit, this bride gonna be collapsed. find the maximum weight of a stuff that is able to
  get to the destination from start at once. 
> <br />
> <br />

> ### 2. Redefining a problem
>  There are vertaxes (v) that have the specific weight for each vertax. some vertax has multiple edges connecting 
  another vertax. because this graph is actually undirected, there are several ways to get the destination. find the maximum
  weught if a stuff.
> <br />
> <br />

> ### 3. Making a plan
>  I think it can't be solve by using just backtracking, cuz this size is too big.. here i would like to use binary search and
  dfs. fistly, set the mid value by binary process. find the path to reach the destination maintaining mid value is smaller than 
  the weight limit each bridge has or equals it. if there doesn't exist the path with mid vale, then right should be mid - 1,
  if not, left should be mid. when it's out of the binary searching process, answer has to be in the left value.
  return it.
> <br />
> <br />
> ### 4. Validate a plan
>  Basically, i gonna use binary search and dfs, so it should be O(V+E log(2) N) (1 <= V <= N, 1<= E <= 100,000, 1 <= N <= 10,000)
  it's almost 3,000,000 enough to pass the problem.
> <br />
> <br />
> ### 5. Implement
>  Here is my code [using binary search](https://github.com/DevStevenLee/Algorithm/blob/master/BinarySearch/WeightLimit_1939/WeightLimit_1939.java) but it failed..
>
>   #1. it patched by DevSteven (2019-11-30 14:04)
>
> <br /> 
> <br />
>
> ### 6. How it can be improved
>  First apporaching failed cuz it has the problem within binary searching process. after checking the path existence or non
> existence, if it doesn't exist, right should be mid - 1 obviously, but here is the problem if it exists, left should be
> mid. it gonna take a long. therefore, letting left mid + 1 is right approaching answer should be right when searching in
> (left <= right) condition  
> <br /> 
> <br />
>  		by DevSteven (2019-11-30. 14:04)
> 

