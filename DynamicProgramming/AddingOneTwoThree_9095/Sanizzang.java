/*
 * Date: 2020.08.10
 * Writer: Sanizzang
 */
import java.util.*;

public class Main
{
    static int cnt = 0;
    static int solve(int N){
        if(N == 0){
            ++cnt;
            return 0;
        }
        if(N - 1 >= 0) solve(N - 1);
        if(N - 2 >= 0) solve(N - 2);
        if(N - 3 >= 0) solve(N - 3);
        return cnt;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] N = new int[num];
		for(int i = 0;i < num;i++){
		    N[i] = scan.nextInt();
		}
		for(int i = 0;i < num;i++){
		    System.out.println(solve(N[i]));
		    cnt = 0;
		}
	}
}

/*
 * Description:
 * I solved this problem without using dynamic programming.
 * I thought only recursive function.
 * First get an N.
 * Inspect whether it can be divided in order 1, 2, 3.
 * If the parameter value of the function is zero, count it.
 */
