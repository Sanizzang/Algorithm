# Six Steps
<br />

> ## Problem:[Stick](https://www.acmicpc.net/problem/1094)
>
> ### 1. Understanding problem
> There is 64cm stick. We are going to make Xcm stick by using this process  
> 1) Add all of sticks' length.  
> 2) Find the shortest stick, and cut it into half.  
> 3) Discard half of the shortest stick and if total length is longer than Xcm, Discard it completely.  
> 4) Repeat 2) and 3) Until sum of the length is Xcm.  
> 5) Connect the remaining sticks.  
>
> Find number of sticks to make Xcm.
> ### 2. Redefining a problem
> Find number of cut sticks to make Xcm of stick (1 <= X <= 64). 
> ### 3. Making a plan
> The Xcm stick is made by at most one 64cm, 32cm, 16cm, 8cm, 6cm, 4cm, 2cm, 1cm sticks.
> So we can make Xcm sticks by adding those length of sticks.
> To do this, we need to make to X binary number and count number of 1s.
> ### 4. Validate a plan
> Time complexity is O(logX), since X is less than 64, there is enough time.
> ### 5. Implement
>
> ### 6. How it can be improved
>
>
>

