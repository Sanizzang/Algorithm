# Six Steps
<br />

> ## Problem: [Guitar Lesson 2343](https://www.acmicpc.net/problem/2343)
>
> ### 1. Understanding problem
>  A person wanna make own lessons blu rays that should be recorded in increasing order of the lessons.
  therefore, if the person would like to record from i lesson to j lesson, all lessons between i and j should be recored.
  when blu rays are the same size, the task is finding the minimum size of blu ray that is the number of M

> <br />
> <br />
> ### 2. Redefining a problem
>  Let's assume that L is the size of a lesson and B is the number of blu rays. also, Let's say an arbitray set of 
  L(i) + \*\*\* + L(j) is S. it should be redefined in a way such that "find the minimum blu ray size when the number of
  S equals to M."
> <br />
> <br />
> ### 3. Making a plan
>  It can be solved by binary search. first of all, set mid in binary search as the value for the minimum blu ray size.
  count the number of dividing lessons into blu rays in the standard form that is every sets is not bigger than mid.
  if counting is bigger than M, left should be mid + 1, if not right should be mid. after this process done, print out
  right that is we're looking for.
> <br />
> <br />
> ### 4. Validate a plan
>  It gonna take O(n log n). becuase it should take O(log N) for binary search. also, it should be needed to count dividing
  it has to take O(n). as a result O(n log n) enough to pass the problem :D
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

