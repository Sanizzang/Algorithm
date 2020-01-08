# Six Steps
<br />

> ## Problem:[Picking](https://www.acmicpc.net/problem/2966)
>
> ### 1. Understanding problem
> Three people A, B, and C are going to pick answers for exam.  
> A is going to pick answers like A, B, C, A, B, C, ...  
> B is going to pick answers like B, A, B, C, B, A, B, C, ...  
> C is going to pick answers like C, C, A, A, B, B, C, C, A, A, B, B, ...  
> For given answer of the exam, find the highest score of A, B, C and person who has the highest score.
> ### 2. Redefining a problem
> For given N (1 <= N <= 100), and exam answer which length is N, find the highest score and person with the highest score.
> ### 3. Making a plan
> We are going to solve it by using brute force.
> We are going to make answer list and score of three people.
> And we can compare written_answer[i % len(written_answer)] and exam_answer[i], If it is correct, we can add score by 1.
> Finally, we can compare these scores and find people with highest score.
> ### 4. Validate a plan
> Time complexity is O(N) since N is small than 1000, we have enough time to calculate.
> ### 5. Implement
> Here is my first code using brute force.  
> [code](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/Picking_2966/Picking_2966_kyongkyong289.py)
> (kyongkyong289, Version #1, 2020-01-06)
> ### 6. How it can be improved
>
>
>

