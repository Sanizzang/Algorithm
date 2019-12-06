# Six Steps
<br />

> ## Problem: [Printer Queue ](https://www.acmicpc.net/problem/1966)
>
> ### 1. Understanding problem
>  Here is the new printer that check every importance of a paper in the front of a line.
>  if a current paper is lower than any left papers, this current paper should be rearranged 
>  at the last in the line. what solver has to do is finding out how many times would take 
>  to print out for a given paper.
> <br /> 
> <br />
> ### 2. Redefining a problem
>  First of all, check out how many times would take to print out for a target **(Here i call this M).**
>  if any papers behind of a current paper is bigger than the current paper, this paper should be rearranged at the last
>    A number of testcase is given at the first line. what would be given next line is N, M
>  N is a number of papers, M is the target. (0 <= M < N). lastly, we got a line for importances.
>  each importance, I is 1 <= I < 10.
> <br />
> <br />
> ### 3. Making a plan
>  Simply, it can be solved by simulating how the printer works. let's talk about a process of simulation.
  #1 case: if a current importance is the bigger than any other, it gonna be printed out and count the number of times.
  #2 case: if a current importance is not bigger than any other, it gonna be rearranged at last and don't count it.
  **(Every time we check out the front importance is the one solver looking for)**
> <br />
> <br />
> ### 4. Validate a plan
>  A number of N is less than 101 (N <= 100). importance of the rangei, I is more than 0 and less than 10 (1 <= I < 10).
  so computation time is the result multiplied 100 and 10. therefore time complexity is O(N) and it's almost 1000 enough to solve
  the problem.
> <br /> 
> <br />
> ### 5. Implement
>  Here is my first approaching [using a normal brute force.](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/PrinterQueue_1966/PrinterQueue_1966_Steven.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

