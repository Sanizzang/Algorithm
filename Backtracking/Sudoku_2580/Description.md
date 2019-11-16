# Six Steps

<br />

> ## Problem: [Sudoku 2580](https://www.acmicpc.net/problem/2580)
>
> ### 1. Understanding problem
>   Fill the 9x9 board with the specific number based on the rules for this game. empty space in the board is zero (0)
>  `Rules show below` <br />
>  1. Don't duplicate any number (1 ~ 9) twice each row line, column line.<br />
>  2. Don't duplicate any number (1 ~ 9) twice in the 3x3 box. <br />
>  
>  What solver has to do is making the board valid !!
> <br />
> <br />

> ### 2. Redefining a problem
>  G(x) = {Ax < N ^ 1 <= x <= 9 | x makes the sudoku board valid }. the mission is replacing every zero in the board to G(x).
>  print out the board.
> <br />
> <br />

> ### 3. Making a plan
>  Try every case to make the board valid by using backtracking. More detail, replace every single zero to G(x) until every zero 
>  changes to G(x).
> <br />
> <br />

> ### 4. Validate a plan
>  Actually, there is no limitaion for the problem. we don't know how long it takes. but time complexity should be O(!N).
> <br />
> <br />
> ### 5. Implementi
>  Here is my first approaching [using backtracing](https://github.com/DevStevenLee/Algorithm/blob/master/Backtracking/Sudoku_2580/Sudoku_2580.java)
> <br /> 
> <br />

> ### 6. How it can be improved
>
>
>

