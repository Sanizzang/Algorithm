import java.util.*;
import java.io.*;


class Steven{
	private static int N;
	
	public static void solve(char[][] map, int[] d, int row, int len){
		for(int col = 0 ; col < N ; col++){
			if(map[row][col] == 'W' && len < d[col]){
				d[col] = len;
				solve(map, d, col, len + 1);
			}
		}
	}

	public static int getTheWeakness(int[] d){
		int max = d[0];
		for(int i = 0 ; i < N ; i++){
			max = Math.max(max, d[i]);
		}

		return max;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		char[][] map = new char[N][N];

		for(int i = 0 ; i < N ; i++){
			map[i] = br.readLine().toCharArray();
		}
		
		int gosu = 0;
		int weakness = 9000;

		for(int i = 0 ; i < N ; i++){
			int[] d = new int[N];
			Arrays.fill(d, 9000);
			d[i] = 0;
			solve(map, d, i, 1);

			int candidate = getTheWeakness(d);
			if(weakness > candidate){
				gosu = i+1;
				weakness = candidate;
			}
		}

		bw.write(weakness + " " + gosu + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
