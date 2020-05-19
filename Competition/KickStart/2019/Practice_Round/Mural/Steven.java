import java.util.*;
import java.io.*;

class Steven{
	private static int N;

	public static int solve(int[] walls, int start, int gap){
		int max = 0;
		
		for(int i = start ; i <= N ; i++){
			max = Math.max(max, walls[i] - walls[i-gap]);
		}

		return max;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for(int t = 1 ; t <= testCase ; t++){
			N = Integer.parseInt(br.readLine());
			int[] walls = new int[N + 1];
			
			String s = br.readLine();
			for(int i = 1 ; i <= N ; i++){
				walls[i] = (s.charAt(i-1) - '0' + walls[i-1]);
			}
			
			int start = N % 2 == 0 ? N / 2 : (N / 2) + 1;
			int gap = start;

			int res = solve(walls, start, gap);
			bw.write("Case #" + t + ": " + res + "\n" );
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
