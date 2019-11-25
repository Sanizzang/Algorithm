# Six Steps
<br />

> ## Problem: [Robot 1726](https://www.acmicpc.net/problem/1726)
>
> ### 1. Understanding problem
>  There is a robot that moves in the direction the robot looks. the controller for the robot has two options.
  first option is Go k. robot would move k step (1 <= k <= 3) in the direction the robot sees.
  second option is Turn dir. robot turns around left or right such a 90 degree.
  here is the mission that finds the minimum commands to get to the destination and the same direction the robot sees
  such that target sees from the start.
> <br />
> <br />
> ### 2. Redefining a problem
>  Assume that D is the number of how many times the robot turn around, M is the number of movement of the robot and 
> C is minimum commands such that the robot is completely same with the target robot for direction and position. <br />
>  
> n (- N : find C of D(n) (1 <= n <= 4) + M(n) (1 <= n <= 3).
> <br />
> <br />
> ### 3. Making a plan
>  The plan is using BFS to move each postion until get to the destination. don't consider simultaneously direction and movement.
  when it moves next. just consider each every case seprating direction and movement at the position. keep doing this then,
  possibly, it can get to the target !!
> <br />
> <br />
> ### 4. Validate a plan
>  Just using a BFS skill it gonna take O(M\*N) size of the map. it's enough to pass the problem :D 
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

