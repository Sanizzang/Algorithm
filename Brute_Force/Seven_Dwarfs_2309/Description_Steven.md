# Six Steps
<br />

> ## Problem: [Seven Dwarfs 2309](https://www.acmicpc.net/problem/2309)
>
> ### 1. Understanding problem
> There are 9 dwarfs which means it has to be `natural numbers.` we have to find out
  7 real dwarfs whose heights are **sum up to 100.** the important things that we need to know is that
  these little kids are nor taller than 100 and their heights are natural number.
  Lastly, print out heights of dwarfs in increasing order. if there are many available answers, just pick one result.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's defines N as a number of dwarf. Here N should be 9. H defines as how tall they are. Here, H <= 100
  Finally, we can define like this. H1 + H2 + \*\*\* + Hn-1 + Hn = 100. (n = 7 and n = n C N).  
> <br />
> <br />
> ### 3. Making a plan
>  The limitation of a problem is not too big to implement. therefore, we can find out all combinations of 
  dwarfs that are sum up to 100. In other words, Let's think dwarf as switch. we just check out when switches turn on
  and a number of switches are 7. For example, O defines as turning on and X defines as turning off.
  we check if O equals to 7 from XXXXXXXXX (X = turn off) to OOOOOOOOO (O = turn on).
> <br />
> <br />
> ### 4. Validate a plan
>  There are 9 dwarfs so time complexity should be `O(2^9) = 512` is enough to solve the problem. Because time limitation 
  of the problem sets 2 sec.
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching [using a nomarl brute force](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/Seven_Dwarfs_2309/Seven_Dwarfs_2309.java)  
> Added some comments on the script  
> (kyongkyong289 #2 patch, 2019-12-05)
> <br /> 
> <br />
> ### 6. How it can be improved
> I think the code can be improved by adding some comments. This will not change the time complexity, but, if you add comments,
> then other people can see your code and understand your code more easily.  
> (kyongkyong289, #1 review, 2019-12-05)  
>

