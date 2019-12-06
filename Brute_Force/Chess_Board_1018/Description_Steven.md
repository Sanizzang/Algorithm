# Six Steps
<br />

> ## Problem: [Chess Board 1018](https://www.acmicpc.net/problem/1018)
>
> ### 1. Understanding problem
>  There is the chess board consisting of N (row) and M (column). a person wanna make a new 8\*8 size board by cutting a board.
  chess board should be painted black and white alternately. when the person can cut at any position in the board, 
  get the minimum number of repainting rectangles in the board to make a chess board.
> <br />
> <br />
> ### 2. Redefining a problem
>  Let's say M\*N size chess board is C, 8\*8 size chess board is B, B should be a piece of C by cutting a board in any position
  in C. the task is "Get the minimum number of repainting rectangles in B to make a chessboard". chess board has to be two
  forms. first, left top is white. second left top is black.
> <br />
> <br />
> ### 3. Making a plan
>  It can be solved by brute force. first, try every cases of cutting 8\*8 size board from the board.
  second, comparing this board with two cases that is mentioned just before (left top is white, left top is black).
  third, if the rectangle in the board is different with the block in the case, count 1.
  fourth, keep update the minimum counting from case1 and case2.
> <br />
> <br />
> ### 4. Validate a plan
>  i gonna use brute fore. therefore, it gonna take O(n^4) enough to pass the problem. 
> <br />
> <br />
> ### 5. Implement
>  Here is my [first apporach](https://github.com/DevStevenLee/Algorithm/blob/master/Brute_Force/Chess_Board_1018/ChessBoard_1018_Steven.java) using brute force                (#1. Steven, 2019-12-06 06:56)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

