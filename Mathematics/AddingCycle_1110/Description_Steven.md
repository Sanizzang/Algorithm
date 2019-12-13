# Six Steps
<br />

> ## Problem: [Adding Cycle 1110](https://www.acmicpc.net/problem/1110)
>
> ### 1. Understanding problem
>   The task is counting how many times it takes to satisfie with N(k) == N(k+a). 
>  N(k) is the number at Kth. N(k+1) should be consisted by following rules. <br />
>  <br />
>  rule #1, add numbers on each digits. <br />
>  rule #2. connect number on the last digit of the initial number with number on the last digit of new number <br />
> <br />
> <br />
>
> ### 2. Redefining a problem
>  Let's say a number of digits is l. therefore, l(N) means a number of digits for N.
  define d is a digit. d(k) should be kth digit.
  then, if l(N(k)) == 1, S == N(k), N(k + 1) == connecting N(k) with N(k).
  if l(N(k)) == 2, S == d(1) + d(2) for N(k), N(k+1) == connecting d(2) for N(k) with d(2) for S.
> <br />
> <br />
> ### 3. Making a plan
>  it's just resolved by simulation based on the rules. get the number, check it's a length of digits.
  if the length is bigger than 9, if not. etc.. it can be easily solved.
> <br />
> <br />
> ### 4. Validate a plan
>  it's up to N. if the number can not be detected with inital number, infinity. if not, it can return.
> <br />
> <br />
> ### 5. Implement
>  Here is my [source code](https://github.com/DevStevenLee/Algorithm/blob/master/Mathematics/AddingCycle_1110/AddingCycle_1110_Steven.java) using simulation
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

