/*
 * Date: 2020.08.13
 * Writer: Sanizzang
 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] bag = new int[N + 5];
		Arrays.fill(bag, 12345678);
		
		bag[3] = 1;
		bag[5] = 1;
		
		for(int i = 6;i < N + 1;i++){
		    bag[i] = Math.min(bag[i - 3], bag[i - 5]) + 1;
		}
		
		int result = (bag[N] < 12345670) ? bag[N] : -1;
		System.out.println(result);
	}
}
/*
 * Description:
 * First I set the rule on this question at 3 and 5.
 * If the value K is the minimum value for delivery, the minimum value of K - 3 and K - 5 plus 1 is K.
 * Because the values of K - 3 or K - 5 already have a minimum value in that numbers, so adding 1 to that value
 * becomes minimum value of the K.
 */
