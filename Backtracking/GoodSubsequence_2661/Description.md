# Six Steps
<br />

> ## Problem: [Good subsequence](https://www.acmicpc.net/problem/2661)
>
> ### 1. Understanding problem
>  There are two sequences consisting of number 1, 2, 3. bad sequence define as close two subsequences of any same length in the 
  sequence are the same. else it's good sequence. Let's find the shorest good sequence of N length.
> <br />
> <br />
> ### 2. Redefining a problem
>  Assume that G is sequence, H is subsequence of G. Also, Let's assume some symbols below
>> 1 <= n <= size of G, n (- N. all n is the specific position in G <br />
>> 1 <= s <= size of G, s (- N. all s is the start of any H.<br />
>> 1 <= k <= size of G / 2, k (- N. all k is the length of H. <br /> 
>
> therefore, when P = H(n(s) \*\*\* n(s+k-1)), H(n(s+k) \*\*\* n(s+2k-1)) which of componenets are close two subsequences 
> of any same length. find shorest G that doesn't satisfied with P.
> <br />
> <br />
>
> ### 3. Making a plan
>  Keep adding one of 1, 2, 3 to the G until G satisfied with P. if G is satisfied with P, get rid of the last number in 
  G and add another number of 1, 2, 3. when the length of G reaches out to the N, print out it.
> <br />
> <br />
>
> ### 4. Validate a plan
>  Obviously, It gonna take O(3^N). but it should not accept to exist duplicated H in G. it would be enough to pass the
  problem.
> <br />
> <br />
>
> ### 5. Implement
> Here is my first approaching [using Backtracking](https://github.com/DevStevenLee/Algorithm/blob/master/Backtracking/GoodSubsequence_2661/Description.md)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

