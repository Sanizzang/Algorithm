# Six Steps
<br />

> ## Problem: [DisassembleAndSum 2231](https://www.acmicpc.net/problem/2231)
>
> ### 1. Understanding problem
>  Disassemble and sum of natural number N defines as N plus the number of digits forming N.
  constructor which makes disassemble and sum number N called M. For example, disassemble and sum of 245 should be
  256(=245 + 2 + 4 + 5) therefore, 245 would be the constructor of 256. 
  Find out the smallest constructor from a given number N. If there is no answer to make up a N from a constructor.
  print out 0. 
> <br />
> <br />
> ### 2. Redefining a problem
>  There exists a natural number N (1 <= N <= 1,000,000). I define D as disassemble and sum meaning that 
  N + the number of digits forming N. constructor number that make up D would be called as M. Find out the
  smallest constructor from a given N.
  To sum up, there exists M1, M2, M3 \*\*\* can change to N formed as D. find out the smallest one in M1, M2, M3 \*\*\* 
> <br />
> <br />
> ### 3. Making a plan
>  A number of inputs are not huge to use brute force. It's engouh to count in 2 sec. therefore, i gonna check out
  each D of a number whether it can make up the given N or not. 
> <br />
> <br />
> ### 4. Validate a plan
>  Just count 1,000,000 times with the number of digits. it could be O(N). It's enough to solve the problem :)
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching [using a normal brute force.](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/DisassembleAndSum_2231/DisassembleAndSum_2231_Steven.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

