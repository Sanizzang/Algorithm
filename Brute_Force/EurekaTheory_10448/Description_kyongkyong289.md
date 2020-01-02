# Six Steps
<br />

> ## Problem:[EurekaTheory](https://www.acmicpc.net/problem/10448)
>
> ### 1. Understanding problem
> Triangle numbers (Tn) are sum of 1 from n.  
> Tn = 1 + 2 + ... + n  
> Gauss discovered that any natural numbers can be expressed by sum of at most three triangle numbers.  
> Determine whether a number can be expressed by sum of exactly three triangle numbers.
> ### 2. Redefining a problem
> For natural number N, (3 <= N <= 1000), determine whether N can be expressed by sum of exactly three triangle numbers.
> ### 3. Making a plan
> Since N is small, we can use brute force.  
> First, we should find triangle numbers less than 1000.  
> Second, we should add triangle numbers for all of the cases.
> ### 4. Validate a plan
> Time complexity is finding triangle numbers is O(sqrt(n)) and adding all cases is O(sqrt(n) * 3) which is O(n * 1.5).
> Since N is less than 1000, we have enough time to calculate. 
> ### 5. Implement
>
> ### 6. How it can be improved
>
>
>

