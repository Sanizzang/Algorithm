# Six Steps
<br />

> ## Problem: [Immigration Examination 3079](https://www.acmicpc.net/problem/3079)
>
> ### 1. Understanding problem
>  There is the Croatian delegation consisting of M people. There are N check-in desks open.
  officals operate at different speeds. At the k-th dest, T(k) seconds are required to finish chech in.
  A person can only occupy an available dest. At the moment, the person can immediately occupy the dest
  (if there is one), but !! can also choose to wait for another dest. the mission is finding the moment
  when all of them have finished check in is as soon as possible.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's assume that predicate P is taking the time to finish check in for the number of M people through T(n) 
  (1 <= n <= 100,000) the main point is that each offical is independent which means, it doesn't affect 
  any workers !! basically, it's just a rotation. therefore, every sum of T(k) | taking time for 
  all the people supposed to be the number of people.
> <br />
> <br />
> ### 3. Making a plan
>  As i mentioned eariler, the formula for result, "every sum of T(k) | taking time for 
  all the people = the number of perople" here is the idea. assuming that we know the answer 
  as mid in binary search, the minimum time, then, check it equals to M with the formula. 
  if it's less than M, left should be mid + 1. if not, right should be mid.
> <br />
> <br />
> ### 4. Validate a plan
>  Becuase i gonna use binary search, it should take O(log n). also, to calculate the formular, it need 
   to take O(n) as a result, it has to take O(n log n) enough to pass the problem :D
> <br />
> <br />
> ### 5. Implement
> Here is my [first approaching](https://github.com/DevStevenLee/Algorithm/blob/master/BinarySearch/ImmigrationExamination_3079/Description_Steven.md) using binary search especially, lower bound
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

