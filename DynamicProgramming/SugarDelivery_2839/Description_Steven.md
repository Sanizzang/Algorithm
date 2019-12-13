# Six Steps
<br />

> ## Problem: [Sugar Delivery 2839](https://www.acmicpc.net/problem/2839)
>
> ### 1. Understanding problem
>  There are 3kg, 5kg sugar bags that should be delivered to a customer. for example, a customer needs 18kg sugars.
  you can deliver 3kg 6 bags, but you can also 5kg 3 bags and 3kg 1 bag. here is the mission you gonna find the minimum
  number of bags to deliver for N.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's say t is weight of sugar, S[t] is the number of bags for t. then, mission is 3i + 5j = k (0 <= i, 0 <= j) 
  S[k] = the minimum number of bags for k. the task is getting S[k].
> <br />
> <br />
> ### 3. Making a plan
>  Let's say (3i - 3) + 5j is k'(1), 3i + (5j - 5) is k'(2). k = 3i + 5j, S[k] should be min(S[3i - 3 + 5j], S[3i + (5k - 5)]) + 1
  therefore, set S from 0 to k. get S[k] that's it :D
> <br />
> <br />
> ### 4. Validate a plan
>  First of all, To check a number equals to 3i + 5j, it needs to take O(N), also to calculate this function i mentioned above,
  it should take O(N). as a conclusion, it takes O(n) time complexity 
> <br />
> <br />
> ### 5. Implement
>  Here is my [first apporaching](https://github.com/DevStevenLee/Algorithm/blob/master/DynamicProgramming/SugarDelivery_2839/SugarDelivery_2839_Steven.java) using dynamic programming
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

