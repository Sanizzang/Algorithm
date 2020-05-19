import java.util.*;
import java.io.*;

class Steven{
	private static int N, K;

	public static int solve(int[] map, int max){
		int left = 1;
		int right = max;

		while(left < right){
			int mid = (left + right) / 2;
			
			int cnt = 0;
			for(int i = 1 ; i < N ; i++){
				int diff = map[i] - map[i-1];
				int quot = diff / mid;
				int remainder = diff % mid;

				if(quot > 0){
					if(remainder == 0) cnt = cnt + quot - 1;
					else cnt+=quot;
				}
			}

			if(cnt > K) left = mid + 1;
			else right = mid;
		}

		return right;
	}

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = in.nextInt();

		for(int t = 1 ; t <= T ; t++){
			N = in.nextInt();
			K = in.nextInt();

			int[] map = new int[N];
			
			int max = 0;
			for(int i = 0 ; i < N ; i++){
				map[i] = in.nextInt();
				if(i > 0) max = Math.max(max, map[i]-map[i-1]);
			}
			
			bw.write("Case #" + t +": " + solve(map, max) + "\n");
		}

		bw.flush();

		in.close();
		bw.close();
	}
}
