# Six Steps
<br />

> ## Problem: [Sum of four integers to zero](https://www.acmicpc.net/problem/7453)
>
> ### 1. Understanding problem
>  There are 4 integer arrays of the same size A, B, C, D. the mission is counting the (a, b, c, d) pairs 
  such that A[a] + B[b] + C[c] + D[d] = 0 
> <br />
> <br />
> ### 2. Redefining a problem
>  count (a, b, c, d) pairs that A[a], B[b], C[c], D[d] = 0. firstly, there doesn't consider duplicated pair
  therefore each pairs are independent. also, it should be a part of combination. don't need to think order.
> <br />
> <br />
> ### 3. Making a plan
>  First of all, make two combinations that have sum of all elements of each two arrays like A, B and C, D.
  then, the size of each combinations should be N\*N. After sorting for these new arrays, the result would be 
  the sum of -combinations1(i) 0 <= i < N * N in the combination2 by using binary search. the main point is that 
  mulitple cases of -combinations1(i) in the combinations2 would be multiple. so the number of this case is 
  (position at the target + 1) - the position of target at the leftmost !!
> <br />
> <br />
> ### 4. Validate a plan
>  It gonna take O(n^2 log n^2) because i acutally make the combinations of each two arrays taking O(n^2) and binary search 
  would take O(log N^2) so it should be O(n^2 log n^2) enough to pass the problem :D
> <br />
> <br />
>
> ### 5. Implement
>  Here is my code [using binary searching](https://github.com/DevStevenLee/Algorithm/blob/master/BinarySearch/SumOfFourIntegersToZero_7453/SumOfFourIntegersToZero_7453.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

