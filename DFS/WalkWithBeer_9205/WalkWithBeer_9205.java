import java.util.*;
import java.io.*;

class H_9205{
	private int row, col;
	
	H_9205(int row, int col){
		this.row = row;
		this.col = col;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
}

class WalkWithBeer_9205{
	private static int N;
	private static final int LIMIT = 1000;
	public static boolean dfs(int now, H_9205[] map, boolean[] visited){
		if(now == N + 1) return true;

		visited[now] = true;
		
		boolean res = false;

		for(int next = 0 ; next < N + 2 ; next++){
			int distance = Math.abs(map[next].getRow() - map[now].getRow()) + Math.abs(map[next].getCol() - map[now].getCol());
				
			if(!res && !visited[next] && distance <= LIMIT)
				res = dfs(next, map, visited);
		}

		return res;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		while(testCase-- > 0){
			N = Integer.parseInt(br.readLine());
			H_9205[] map = new H_9205[N+2];
			
			for(int i = 0 ; i < N + 2 ; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				int col = Integer.parseInt(st.nextToken());
				int row = Integer.parseInt(st.nextToken());
				map[i] = new H_9205(row, col);
			}

			if(dfs(0, map, new boolean[N+2]))
				bw.write("happy\n");
			else
				bw.write("sad\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
