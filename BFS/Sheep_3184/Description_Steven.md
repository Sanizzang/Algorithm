# Six Steps
<br />

> ## Problem: [Sheep 3184](https://www.acmicpc.net/problem/3184)
>
> ### 1. Understanding problem
>  There is the field with some sheeps and some wolfs within fences. these animals can move only horizontally and vertically.
  win or lose depends on the number of animals. if the number of sheep is more than wolf. sheeps can kill wolfs. if not, sheeps
  killed by wolfs. count alive sheeps and wolf
> <br />
> <br />
> ### 2. Redefining a problem
>   Let's assume that G is the field, F is a fence in G. there are some symbols below
>> all f, s, w (- N. <br />
>> f is the number of fences (0 <= f <= size of G). <br />
>> s is the number of sheeps in F(f). <br />
>> w is the number of sheeps in F(f).
>
>  therefore, the mission is F0(s, w) F1(s, w), F1(s, w) + \*\*\* + Ff(s, w).
> <br />
> <br />
>
> ### 3. Making a plan
>  When a sheep or a wolf is detected, use bfs to count every sheeps and wolfs in the fence. after this, determine which animal
  is winner. we do the step f times. lastly, print out total animals.
> 
> <br />
> <br />
>
> ### 4. Validate a plan
>  we gonna use bfs skill so we just visit only one time O(size of the filed). the maximum size of the field is 250 X 250 
  it's enough to pass the problem :D
> <br />
> <br />
>
> ### 5. Implement
>  Here is my first approaching [using BFS](https://github.com/DevStevenLee/Algorithm/blob/master/BFS/Sheep_3184/Sheep_3184.java)
> <br /> 
> <br />
>
> ### 6. How it can be improved
>
>
>

