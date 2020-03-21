#Six Steps
<br />

> ## Problem: [Math is a sports 2](https://www.acmicpc.net/problem/17362)
>
> ### 1. Understanding problem
>  There is a rule such that The thumb is 1, index is 2, middle is 3, index is 4, little is 5, index is 6, middle is 7, index finger 8, thumb is 9 and again index is 10. here is a question "What is the Nth finger in this rule?"
> <br />
> <br />
>
> ### 2. Redefining a problem
>  Let's think of it as a cycle to return from thumb to thumb then, the task should be like this. what is the finger at a + 8n (a, n are natrual number, 1 <= a <= 5 and 0 <= n) 
> <br />
> <br />
>
> ### 3. Making a plan
>  I gonna use a mathematcial way with a module. in more detail, a + 8n % 8 is the finger. therefore, the answer is a % 8.
> <br />
> <br />
>
> ### 4. Validate a plan
>  First of all, why it's divided by 8 because the cycle would be ignored. also, it gonna get the "a" as a remainder.
> here are formulars (A + B) % M  = ((A % M) + (B % M)) % M, (A X B) % M = ((A % M)) X (B % M) % M. therefore, 
> (a + 8n) % 8 = ((a % 8) + (8n % 8)) % 8, 8 X n % 8 = ((8 % 8) X (n % 8)) % 8 is 0 such that (a % 8) + 0 is a.
> <br />
> <br />
>
> ### 5. Implement
>  
> <br /> 
> <br />
>
> ### 6. How it can be improved
>
>
>

