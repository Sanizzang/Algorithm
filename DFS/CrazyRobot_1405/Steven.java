import java.util.*;
import java.io.*;

class Steven{
	private static int N;
	private static double res;
	private static double[] possible = new double[4];
	
	private static int[] NR = new int[]{0, 0, -1, 1};
	private static int[] NC = new int[]{1, -1, 0, 0};

	//0 = East
	//1 = West
	//2 = South
	//3 = North
	
	public static void solve(boolean[][] visited, int row, int col, double candidate, int cnt){
		if(cnt == N){
			res+=candidate;
			return;
		}

		for(int i = 0 ; i < 4 ; i++){
			int nextR = row + NR[i];
			int nextC = col + NC[i];

			if(nextR < 1 || nextR > 29 || nextC < 1 || nextC > 29 || visited[nextR][nextC]) 
				continue;

			visited[nextR][nextC] = true;
			solve(visited, nextR, nextC, candidate * possible[i], cnt + 1);
			visited[nextR][nextC] = false;
		}
			
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i < 4 ; i++){
			possible[i] = Integer.parseInt(st.nextToken()) / 100.0;
		}
		boolean[][] visited = new boolean[30][30];
		visited[15][15] = true;

		solve(visited, 15, 15, 1, 0);
		bw.write(res + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
