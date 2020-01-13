# Six Steps
<br />

> ## Problem:[AlarmClock](https://www.acmicpc.net/problem/2884)
>
> ### 1. Understanding problem
> Find a time which is 45 minutes faster than certain time.
> ### 2. Redefining a problem
> For given number H and M (0 <= H <= 23, 0 <= M <= 59), find a time which is 45 minutes faster than H:M.
> ### 3. Making a plan
> We can calculate total minutes passed by 0:00 by finding H * 60 + M.  
> Then we can subtract 45 minutes.  
> If total minutes is less than 45, we can add 1440, which is total minutes of day and subtract 45.
> ### 4. Validate a plan
> Time complexity is O(1), we have enough time to calculate.
> ### 5. Implement
> 
> ### 6. How it can be improved
>
>
>

