/*
 * Date: 2020.08.02
 * Writer: Sanizzang
 */
import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int[] values = new int[N + 1];
	for(int i = 2;i <= N;i++){
	    values[i] = values[i - 1] + 1;
	    if(i % 3 == 0) values[i] = Math.min(values[i], values[i / 3] + 1);
	    if(i % 2 == 0) values[i] = Math.min(values[i], values[i / 2] + 1);
	}
	System.out.println(values[N]);
    }
}
/*
 * Description:
 *
 * First, I made visited array.
 * This array stores the number of times I divided the values.
 * If value is into function, Check this value whether divided three or two.
 * If the number of times you divided the value now is less than the value you divided before, replace it with a smaller number. 
 * Through this process, you will get the minimum value.
 *
 * By: Sanizzang
 */


/*
 * Review:
 *
 *  I would like to say that this problem should be solved by dynamic programming if it needs efficient way.
 * so try this approach not brute force & backtracking. also, you don't need to consider -1 as a independent case
 * it could be regarded as a part of divided 2 and 3 which means it can be functioned with N / 2 and N / 3
 * (Hint: i % 2, i % 3)
 *
 * By Steven, Lee 20.08.02
 *
 *
 * => #1 I resolved it by using Dynamic Programming skill. I used bottom and top of Dynamic Programming skill.
 *    Suppose you run loop from 2 to N, The value of i can be taken from i/2 and i/3. So I can do minimum operation.
 * 								
 * 								By: Sanizzang
 */
