import java.util.*;
import java.io.*;

class Steven{
	private static int N;

	public static int solve(int[] stairs){
		int[][] dp = new int[2][N+1];
		dp[0][1] = dp[1][1] = stairs[1];
		
		dp[0][2] = stairs[1] + stairs[2];
		dp[1][2] = stairs[2];

		for(int i = 3 ; i <= N ; i++){
			dp[0][i] = stairs[i] + dp[1][i-1];
			dp[1][i] = stairs[i] + Math.max(dp[0][i-2], dp[1][i-2]);
		}

		return Math.max(dp[0][N], dp[1][N]);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());

		int[] stairs = new int[N+1];
		for(int i = 1 ; i <= N ; i++){
			stairs[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[N];
		if(N == 1) bw.write(stairs[1] + "\n");
		else if(N == 2) bw.write((stairs[1] + stairs[2]) + "\n");
		else bw.write(solve(stairs) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}

}
