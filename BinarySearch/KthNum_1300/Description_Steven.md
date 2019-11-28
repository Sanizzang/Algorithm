# Six Steps
<br />

> ## Problem: [Kth number 1300](https://www.acmicpc.net/problem/1300)
>
> ### 1. Understanding problem
>  Here is the 2 dimensional array consisting N\*N size. (A room number in the array starts with 1)
  Let's call this A which of values is A[i][j] = i\*j. after it changes into an ordered 1 dimensional array,
  find the Kth element in the array.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's assume that B is the set such {k (- B | B(k) is the element at k in  the ordered 1 dimensional array of which 
  values are from A (it already defined above.)} so proposition is every natural number k ( min(10^9, n^2) ), finding B(k).
> <br />
> <br />
> ### 3. Making a plan
>  N (1 <= N <= 10^5) is too big to try O(N^2). solver has to do it more cleaver. Let's try it with O(N log N) by using
  binary search. Let's think a m value in binary searching as a Kth element. Because A[i][j] is defined by i\*j
  (m / i) meaning that the number of elements that are smaller than mid at each i row. also, (m / i) could be bigger
  than N, therefore, it can be expressed by the sum of min(mid / i, N) from 1 to N. 

> <br />
> <br />
> ### 4. Validate a plan
>  To use binary search, it gonna take (n log n) enough to pass the problem :D.
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching [using Binary Search](https://github.com/DevStevenLee/Algorithm/blob/master/BinarySearch/KthNum_1300/KthNum_1300.java)
> <br /> 
> <br />
> ### 6. How it can be improved (Review)
>
>
>

