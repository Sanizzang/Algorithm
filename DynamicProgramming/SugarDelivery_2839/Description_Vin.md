# Six Steps
<br/>

> ## Problem:[Sugar Delivery](https://www.acmicpc.net/problem/2839)
>
> ### 1. Understanding problem
> These days Sang-Geun doing to sugar delivery by sugar factory
> And than now he should deliver exactly N kilogram
> And the sugar are in the packs and that have two wight 3kg and 5kg
> But the he wanna deliver as little as possible
> For example if he deliver 18kg he can deliver 3kg 6packs
> But He can deliver 5kg 3packs and 3kg 1pack than he can deliver as little a possible
> You have to write on code exaclty when he deliver Nkg sugar, how many takes sugar packs you are.
> <br />
> <br />
>### 2. Redefining a problem
> Given you N. (3<=N<=5000)
>### 3. Making a plan
> First Store in a count variable and
> If N divided into 5 then just do printf("%d",count);
> Or not N divided into 5 then just do for(; count>=0; count--)
> And if count divided into 0 do count+=(N-5*count)/3; and break;
> ### 4. Validate a plan
> The time complexity is O(n) since N <= 5000, this is enough time to calculate.
> ### 5. Implement
> This is my first code using dynamic programming.
> [Code](https://github.com/Vincode-hub/Algorithm/blob/master/DynamicProgramming/SugarDelivery_2839/SugarDelivery_2839_Vin.cpp)
> <br /> 
> <br />
> ### 6. How it can be improved
