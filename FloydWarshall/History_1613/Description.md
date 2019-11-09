#Six Steps
<br /> 

> ## Problem: [History 1613](https://www.acmicpc.net/problem/1613) 
>
> ### 1. Understanding problem
>  Sejun knows the context of historical events. here is the problem we have to solve.
  when some of events that Sejun already knows are given, can we predict answer for some context of 
  historical events we would like to know.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's think think of the context of historical events as the graph called G. define a number of event 
  that Sejun already knows as n. also, define context of this event as K. the contexts we are gonna predict 
  is called S. Finally, this expression is formulated like this. predict S(s1, s2) context in G(Kn). if s1 is 
  ahead of than s2, print out -1, if s1 is not ahead of s2, print out 1. lastly the answer can't derive from 
  G(Kn) then print out 0. 
> <br />
> <br />
> ### 3. Making a plan
>  I think the main point here is that every contexts are marked in graph. therefore, i would like to use floyd
  warshall skill to mark every single context. after this, check out what we want to know.
> <br />
> <br />
> ### 4. Validate a plan
>  N is in range of less than 401. floyd warshall has O(N^3) time complextiy. it's about 64,000,000 enough to 
  pass testcases in 1 sec.
> <br />
> <br />
> ### 5. Implement
>  Here is my first apporaching for [History 1613](https://github.com/DevStevenLee/Algorithm/blob/master/FloydWarshall/History_1613/History_1613.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

