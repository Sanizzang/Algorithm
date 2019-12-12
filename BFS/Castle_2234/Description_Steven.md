# Six Steps
<br />

> ## Problem: [Castle 2234](https://www.acmicpc.net/problem/2234)
>
> ### 1. Understanding problem
>  There is the castle map consisting dotted line and thick line. dotted line means a path that can be passed.
  thick line means a path that can not be passed by a wall. The imformation for walls around a room is given by a number 
  (0 <= p <= 15). this number is the sum of 1(wall to the west), 2(wall to the north), 4(wall to the east), 8(wall to the south)
  the tasks are getting a number of rooms in the castle, getting the maximum room size 
  and get the maximum room size when any wall is removed.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's say castle is C, C[i][j] is a room at i row, j col in the caslte, then here is the task. 
  get a number of the room connected with C[i][j], get the maximum room connected C[i][j] and get the maximum
  room size when any wall is removed.
> <br />
> <br />
> ### 3. Making a plan
>  The imformation for walls around a room is given by a number (0 <= p <= 15), it is supposed to be bit masking.
  also, the room should be connected with C[i][j], it's simply resolved by BFS. what i gonna do is BFS. 
  when i traverse an another room from the current room, check there is the way to go with the wall imformation i got 
  for the current room. these 3 questions would be resolved by this way.
> <br />
> <br />
> ### 4. Validate a plan
>  BFS gonna take O(V + E) enough to pass the problem :D. 
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

