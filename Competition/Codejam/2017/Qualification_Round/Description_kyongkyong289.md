# Six Steps
<br />

> ## Problem:[TidyNumbers](https://code.google.com/codejam/contest/3264486/dashboard#s=p1)
>
> ### 1. Understanding problem
> For a natural number M, M is a tidy number if digits of M is ordered by ascending order.
> For a given N, find the most tidy number which is less than N.
> ### 2. Redefining a problem
> For a given N(1 <= N <= 10 ^ 18), find the most tidy number which is less than N.
> ### 3. Making a plan
> For a certain number N, we can find position which digits are decreasing for the first time.
> Then we can move position left until the number decreases.
> If the number decreases, then we can find position which digit number is decreased by 1.
> then we can add 9 behind of the position.  
> For example 11223344443333,  
> We can find position of decreasing digits, which is 4 to 3 (10th digit).  
> Then we can move left until we find decreasing number.  
> We can find position of decreasing digits which is 3 to 4 (7th digit).  
> We can decrease 7th digit's number by 1.  
> And then we fill 9 from 8th digit to last digit.  
> So, the answer is 11223339999999. 
> ### 4. Validate a plan
> Time complexity is O(logN) since calculation is proportional of digits. Since N is less than 10 ^ 18, we have enough time to calculate.
> ### 5. Implement
> Here is my code.  
> (kyongkyong289, Version #1, 2020-01-14)
> ### 6. How it can be improved
>
>
>

