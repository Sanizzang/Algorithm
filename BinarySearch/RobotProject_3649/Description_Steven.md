# Six Steps
<br />

> ## Problem: [Robot Project 3649](https://www.acmicpc.net/problem/3649)
>
> ### 1. Understanding problem
>  Students need two legos to close the hole of the robot. when students know sizes of legos, get the 
  two legos in a way such that H = l(1) + l(2) and | l(1) - l(2) | is the maximum, l(1) <= l(2). (H = hole, l = lego)
> <br />
> <br />
> ### 2. Redefining a problem
>  Assume that H = hole, l = lego then get the H = l(k) + (H - l(k)), if there are multiple answers, get the maximum value
  in | l(k) - l(k+1) |
> <br />
> <br />
> ### 3. Making a plan
>  First of all, sort a lego array in increasing. let's say that k is the length of a lego array (0 <= k < n - 1)
  u wondering why n - 1 not n. becuase we don't need to search if legos are less than two.
  H = l(k) + (H - l(k)), we have to find (H - l(k)) in range of (k + 1) to n - 1 by using Binary search.
  therefore, default of left should be k + 1, default of right should be n - 1 and condition is left <= right in binary search.
  when it find the result, print it out :D
> <br />
> ### 4. Validate a plan
>  it gonna take O(n log n) enough to pass the problem !! because, i gonna use binary search (log n). also, it has to be
  searched every sizes of lego in the arrays. as a result, O(n log n).
> <br />
> <br />
> ### 5. Implement
>
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

