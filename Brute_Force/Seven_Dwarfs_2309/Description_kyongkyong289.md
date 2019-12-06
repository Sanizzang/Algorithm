# Six Steps
<br />

> ## Problem:[Seven Dwarfs](https://www.acmicpc.net/problem/2309)
>
> ### 1. Understanding problem
> There are nine dwarfs. For a given heights of the dwarfs, find seven dwarfs which sum of their height is 100.  
> Sort their height by ascending sort.
> ### 2. Redefining a problem
> For a given nine dwarfs' height, H1, H2, ..., H9, select seven HS1, HS2, ... Hs7, which HS1 + HS2 + ... + HS7 = 100.
> ### 3. Making a plan
> First, select all dwarfs and deselect two of them, if total of 9 dwarfs' height minus deselected two dwarfs' height is 100,
> the answer is correct.
> ### 4. Validate a plan
> Time complexity is O(n * (n - 1) / 2) which means O(n^2), since 9 is small number, there is enough time to calculate.
> ### 5. Implement
> 
> ### 6. How it can be improved
>
>
>