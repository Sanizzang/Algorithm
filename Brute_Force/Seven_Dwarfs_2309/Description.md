# Six Steps

> ### 1. Understanding problem
> There are 9 dwarfs which means it has to be `natural numbers.` we have to find out
  7 real dwarfs whose heights are **sum up to 100.** the important things that we need to know is that
  these little kids are nor taller than 100 and their heights are natural number.
  Lastly, print out heights of dwarfs in increasing order. if there are many available answers, just pick one result.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's define N as a number of dwarf. Here N should be 9. H define as how tall they are. Here, H <= 100
  Finally, we can define like this. H1 + H2 + \*\*\* + Hn-1 + Hn = 100. (n = 7 and n = n C N).  
> <br />
> <br />
> ### 3. Making a plan
>  The limitation of a problem is not too big to implement. therefore, we can find out all combinations of 
  dwarfs that are sum up to 100. In other words, Let's think dwarf as switch. we just check out when switches turn on
  and a number of switches are 7. For example, O define as turning on and X define as turning off.
  we check if O equals to 7 from XXXXXXXXX (X = turn off) to OOOOOOOOO (O = turn on).
> <br />
> <br />
> ### 4. Validate a plan
>  There are 9 dwarfs so time complexity should be O(2^9) = 512 is enough to solve the problem.
> <br />
> <br />
> ### 5. Implement
> <br />
> <br />
> ### 6. How it can be improved
>

