> #Six Steps
> <br />

> ## Problem: [Height and width of tree 2250](https://www.acmicpc.net/problem/2250)
>
> ### 1. Understanding problem
>  There is a tree based on the rules. #1 a node at the same the level should be on the same row. #2 
  the only one node can exist at the only one column. #3 every left subtrees of the node should be placed at left by the node.
  every right subtress of the node should be placed at right by the node. #4 there is no empty space between leftmost and right 
  most. find the maximum width of level. width defines that (the placed node at rightmost - the placed node at leftmost) + 1.
> <br />
> <br />
> ### 2. Redefining a problem
>  I think #3 and #4 rule would be meant that it should be sorted as inorder. the mission solver has to do means that just find
  leftmost and rightmost nodes at the same level.
> <br />
> <br />
> ### 3. Making a plan
>  the idea is so simply to solve the problem. Make a tree with given values. traverse the map inorder way. find leftmost and 
  rightmost to calculate a width. Lastly, find the maximum width.
> <br />
> <br />
> ### 4. Validate a plan
>  A number of node is N (1 <= N <= 10,000). i gonna find a map by using dfs skill. so its enough to pass the problem :D
> <br />
> <br />
> ### 5. Implement
>  Here is my first approaching [using a normal DFS](https://github.com/DevStevenLee/Algorithm/blob/master/DFS/HeightAndWidthOfTree_2250/HeightAndWidthOfTree_2250.java)
> <br /> 
> <br />
> ### 6. How it can be improved
>
>
>

