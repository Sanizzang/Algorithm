import java.util.*;
import java.io.*;

class Steven{
	private static int N, K;

	public static int[] solve(int[] nums){
		int[] res = new int[K];

		int start = 0;
		int max = 0;

		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < K ; j++){

			}
		}
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
