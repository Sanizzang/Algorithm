# Six Steps
<br />

> ## Problem: [Country Leader](https://code.google.com/codejam/contest/6304486/dashboard)
>
> ### 1. Understanding problem
>  There is the leader in the constitution of a certain country states with the name containing the greatest number of 
  different alphabet letters. the mission is finding who is the real leader from some candidates. for example,
  "GOOGLE" has four different letters. "APAC CODE JAM" has eight different letters. therefore APAC CODE JAM would be the leader.
  if there is a tie, the person whose name comes earliest in alphabetical order is the leader.
> <br />
> <br />
> ### 2. Redefining a problem
>  First of all, define some symbols P, k letting P the number of different letters that the specific candidate has and k should 
  be a candidate. find the maximum P(k) in candidates N. if(P(i) == P(j)), the person whose name comes earliest is the leader.
> <br />
> <br />
> ### 3. Making a plan
>  Make a class for candidate of which elements are name, the number of different letters. then sort this class using Comparable
  return the first class. that's it :D
> <br />
> <br />
> ### 4. Validate a plan
>  Testcase and the number of candidates is not big. so it can be sorted by the function such Comparable, sort without any error.
  so it is enough to pass the problem !!
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching [using brute fore](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/CountryLeader_Codejam/CountryLeader_Codejam.java) 
> <br />
> 					by DevSteven 2019-11-30 06:35 pm
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

