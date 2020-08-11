/*
 * Date: 2020.08.11
 * Writer: Sanizzang
 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N + 1];
		for(int i = 0;i < N;i++){
		    num[i] = scan.nextInt();
		}
		int max = num[0];
		int[] csum = new int[1000000];
		csum[0] = num[0];
		for(int i = 1;i < N;i++){
		    csum[i] = Math.max(csum[i - 1] + num[i], num[i]);
		    max = Math.max(csum[i], max);
		}
		System.out.println(max);
	}
}
/*
 * Description:
 * The fist way I thought about it was to find the number of cases for every addition.
 * But this way caused a time-out.
 * So I pondered again what I missed.
 * So what I find is that if the value I've added before is greater than the value I now distinguish, I keep that value.
 * However, there was an exception if I compare this only.
 * So I separated the value of max from the add array.
 */
