/*
 * Date: 2020.08.10
 * Writer: Sanizzang
 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] tile = new int[10000000];
		tile[0] = 0;
		tile[1] = 1;
		tile[2] = 2;
		for(int i = 3;i <= N;i++){
		    tile[i] = tile[i - 1] + tile[i - 2];
		    tile[i] %= 10007;
		}
		System.out.println(tile[N]);
	}
}
/*
 * Description:
 * I compared the tiles of 2XN sequentially.
 * As a result, I found the rule N = (N - 1) + (N - 2)
 * So I designed to loop N times in the bottom top method.
 */
