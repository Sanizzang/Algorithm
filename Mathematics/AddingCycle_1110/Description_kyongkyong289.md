# Six Steps
<br />

> ## Problem:[Adding Cycle](https://www.acmicpc.net/problem/1110)
>
> ### 1. Understanding problem
> For given two digit number N, a certain calculation can be done.  
> 1. If N is less than 10, add 0 to front.  
> 2. Add two digits of N.  
> 3. Make new number which first digit is second digit of N, and second digit is second digit of sum of two digits.
> Find number of calculations which number returns to N.  
> Example : For number 26.  
> 26 -> 2 + 6 = 8  
> Then new number will be 68.  
> Then number will change from 26 to 26 -> 68 -> 84 -> 42 -> 26  
> So number of required calculation is 4.
> ### 2. Redefining a problem
> Find number of calculation which makes value returning to N.
> ### 3. Making a plan
> We just have to follow the algorithm and if new number is N we can just stop the loop.
> ### 4. Validate a plan
> We don't know time complexity, since we don't know how much calculation required.
> ### 5. Implement
>
> ### 6. How it can be improved
>
>
>

