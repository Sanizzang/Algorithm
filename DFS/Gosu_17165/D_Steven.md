# Six Steps
> <br />
>
> ## Problem: [Gosu 17165](https://github.com/DevStevenLee/Algorithm/blob/master/DFS/Description.md)
>
> ### 1. Understanding problem
>  My task is to find a Gosu and wakness value of Gous. Gosu is a student i when the weakness
> of student i is minimum among all weakness values. here, weakness would be defined as a maximum
> value among d(i, 1), d(i, 2), \*\*\*, d(i, N). d(x, y) is defined as a minimum length of winning path from
> x to y. winning path from x to y is defined as a sequence of K + 1 integers a0 = x, a1, \*\*\*, ak = y,
> where student a(i) has won student a(i+1) for all 0 <= i < K. we call K as the length of this winning path.
> <br />
> <br />
>
> ### 2. Redefining a problem
>  Let's say winning path from x to y is a sequence of a(0) = x, a1, \*\*\*, ak = y where student a(i) has won
> student a(i+1) for all 0 <= i < K. weakness should be a maximum value among d(i, N) (student i, 1 <= N).
> d(x, y) is a minimum length of winning path. therefore, task is to collect all weakness values to get the minimum 
> value weakness of student i
> <br />
> <br />
>
> ### 3. Making a plan
>  Basically, it would be solved by dfs. we gonna get every lengths of winning paths in d(i, 1), d(i, 2), \*\*\*, d(i, N)
> in a conlusion, we just get a minimum value among these paths.
> <br />
> <br />
>
> ### 4. Validate a plan
>  Since all relations of players is given, we can find every connections to get a winning path. if we get this value,
> we also get a weakness value and Gosu. but time complexity has to be O(n^3). it is only possible in a subtask.
> <br />
> <br />
>
> ### 5. Implement
>  Here is my [first approaching](https://github.com/DevStevenLee/Algorithm/blob/master/DFS/Gosu_17165/Steven.java)
> <br /> 
> <br />
>
> ### 6. How it can be improved
>  my first apporaching has to be occuered a lot of multiple cases to visit from x to y. 
> becuase winning path from x to y could be happened in every d(i, N). this inefficient could be decreased by using dijkstra.
>  by Steven, Lee
> 
>
>

