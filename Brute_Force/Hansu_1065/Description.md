# Six Steps
<br />

> ## Problem: [Hansu 1065](https://www.acmicpc.net/problem/1065)
>
> ### 1. Understanding problem
>  If a positive integer n forms arithmetic sequence, we call it Hansu. We need to count arithmetic sequence numbers 
  from 1 to N that is not more than 1000. Especially, a positive number is less then 100 has to be arithmetic 
  sequence. Lastly, Print out a number of Hansu.  
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's define positive integer X as arithmetic sequence. Natural number N should be the limitation less than 1001.
  X should be in the range of 1 and N. Therefore, when 1 <= X <= N (100 <= N <= 1000),  99 + count a number of 
  available arithmetic sequence number for X or when 1 <= X < 100, result is X.
> <br />
> <br />
> ### 3. Making a plan
>  Simply, check out each number whether it's arithmetic sequence nubmer or not. But not start from 1 but 100 because
  we already know if a number is less than 100, it should be the number which has the pattern. therefore, we don't need
  to check it if given N is not more than 100.
> <br />
> <br />
> ### 4. Validate a plan
>  Just check out only 1000 numbers multiplied by its cipher two or three. therefore what we gonna do is less than 3000.
  so it is enough to solve the problem. also, the time limitaion of the problem is 2 sec.
> <br />
> <br />
> ### 5. Implement
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

