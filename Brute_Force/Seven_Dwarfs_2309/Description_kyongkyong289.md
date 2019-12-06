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
> This is my first approach using Brute Force  
> [code](https://github.com/kyongkyong289/Algorithm/blob/kyongkyong289/Brute_Force/Seven_Dwarfs_2309/Seven_Dwarfs_2309_kyongkyong289.py)  
> It worked on sample problem, but Baekjoon says it is wrong. Please, help me.  
> (kyongkyong289, Version #1, 2019-12-06)  
> Change code using binary method, And it worked!  
> (kyongkyong289, Version #2, 2019-12-06)
> ### 6. How it can be improved
> You should use binary method instead of deselecting two dwarfs.
> The binary method is making list of 1 and 0. 1 means selected dwarfs and 0 means deselected dwarf.
> If sum of list is 7 (which means 7 dwarfs are selected.) then, you should add heights of selected dwarfs.  
> if selected[i] == 1: height_sum += dwarfs[i]  
> if sum is 100 then you should return list of dwarfs.  
> Time complexity will be O(2 ^ n) but it is more precise.  
> (kyongkyong289, Review #1, 2019-12-06)