/*
 * Problem: LargestSubarrayLengthK
 * Date: 20.06.11
 * Writer: Steven, Lee
 *
 */
import java.util.*;
import java.io.*;

class Steven{
	private static int N, K;

	public static int[] solve(int[] nums){
		int start = 0;
	
		// It only reaches to N - K because we don't need to check out if it can not be grouped with K size.
		for(int i = 0 ; i < N - K + 1 ; i++){
			for(int j = 0 ; j < K ; j++){
				// If nums[i+j] is bigger than nums[start+j], It means that grouping k size subarray from i to j 
				// is greater than a subarray from start to j.
				if(nums[start+j] < nums[i+j]){
					start = i;
					break;
				}
			}
		}

		// set a res subarray.
		int[] res = new int[K];
		for(int i = 0 ; i < K ; i++){
			res[i] = nums[start+i];
		}

		return res;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		int[] nums = new int[N];

		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int[] res = solve(nums);
		for(int num : res){
			System.out.print(num + " ");
		}

		System.out.println();
	}
}
