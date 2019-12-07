import java.util.*;
import java.io.*;

class InsertOperator_14888_Steven{
	private static int N; 
	private static int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;
	
	private static int[] operators = new int[4];
	private static int[] operatorsLimit = new int[4];
	
	public static void bruteForce(int[] nums, int now, int candidate, int operator){
		int sum = 0;
		
		if(operator == 0) sum = candidate + nums[now];
		else if(operator == 1) sum = candidate - nums[now];
		else if(operator == 2) sum = candidate * nums[now];
		else if(operator == 3) sum = candidate / nums[now];
		
		/* When now reaches out to N, patch the maximum, the minimum*/
		if(now == N - 1){
			maximum = Math.max(sum, maximum);
			minimum = Math.min(sum, minimum);
			return;
		}

		for(int i = 0 ; i < 4 ; i++){
			/* If the number of using operators equals to limitation, go next */
			if(operators[i] == operatorsLimit[i]) continue;
			
			/* If not, add one to using operator[i], go next 
			 * after functions done, minus one to using operators[i]
			 * */
			else{
				operators[i]++;
				bruteForce(nums, now + 1, sum, i);
				operators[i]--;
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0 ; i < N ; i++){
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 4 ; i++){
			operatorsLimit[i] = Integer.parseInt(st.nextToken());
		}
		
		bruteForce(nums, 0, 0, 0);

		bw.write(maximum + "\n" + minimum + "\n");

		bw.flush();
		
		br.close();
		bw.close();
	}
}
