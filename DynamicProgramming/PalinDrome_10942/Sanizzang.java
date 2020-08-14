/*
 * Date: 2020.08.14
 * Writer: Sanizzang
 */
import java.util.*;

public class Main
{
    static int[] nums;
    static int[][] visit;
    static int palinDrome(int S, int E){
        if(nums[S] == nums[E] && ((S - E == 0) || (S - E == -1))){
            visit[S][E] = 1;
            return visit[S][E];
        }
        if(visit[S][E] == 1) return visit[S][E];
        if(nums[S] == nums[E]){
            visit[S][E] = palinDrome(S + 1, E - 1);
        }
        return visit[S][E];
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		visit = new int[2001][2001];
		int N = scan.nextInt(); //입력
		nums = new int[N + 1];
 		for(int i = 1;i < N + 1;i++){
		    nums[i] = scan.nextInt();
		}
		int q = scan.nextInt();
	    int[][] SE = new int[q][2];
	    for(int i = 0;i < q;i++){
	        SE[i][0] = scan.nextInt();
	        SE[i][1] = scan.nextInt();
	    }
	    for(int i = 0;i < q;i++){
	        System.out.println(palinDrome(SE[i][0], SE[i][1]));
	    }
	}
}

/*
 * Description:
 * I'm going to make further improvements.
 */
