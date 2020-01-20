# Six Steps
<br />

> ## Problem:[Finding Prime Numbers](https://www.acmicpc.net/problem/1978)
>
> ### 1. Understanding problem
> Find number of prime numbers in given N numbers.
> ### 2. Redefining a problem
> For given N numbers, (1 <= N <= 100), find number of prime numbers, each numbers are between 1 and 1000 inclusively.
> ### 3. Making a plan
> For each numbers, we just divide a number by 2 from n - 1. If the number is divided by any of these, the number is not prime number.  
> If we find a prime number, then we can just simply add 1 to counter.
> ### 4. Validate a plan
> Time complexity is O(N * M), which M is maximum value of N numbers. since N and M are small(N < 100, M < 1000), we have enough time to calculate.
> ### 5. Implement
> Here is my first code.  
> [code](https://github.com/kyongkyong289/Algorithm/blob/kyongkyong289/Mathematics/FindingPrimeNumbers_1978/FindingPrimeNumbers_1978_kyongkyong289.py)  
> (kyongkyong289, Version #1, 2019-12-19)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

