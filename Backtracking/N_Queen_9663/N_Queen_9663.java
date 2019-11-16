import java.util.*;
import java.io.*;

class N_Queen_9663{
	private static int N;

	public static boolean isValid(int row, int col, int[][] map){
		int r = row, c = col;
		while(r >= 0 && c >= 0){
			if(map[r][c] == 1)
				return false;
			r--;
			c--;
		}
		
		r = row;
		c = col;
		while(r >= 0 && c < N){
			if(map[r][c] == 1)
				return false;
			r--;
			c++;
		}
		
		for(int i = row ; i >= 0 ; i--){
			if(map[i][col] == 1)
				return false;
		}

		return true;
	}

	public static int backtracking(int row, int[][] map){
		if(row == N){
			return 1;
		}

		int cnt = 0;
		for(int col = 0 ; col < N ; col++){
			if(isValid(row, col, map)){
				map[row][col] = 1;
				cnt+=backtracking(row + 1, map);
				map[row][col] = 0;
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		int[][] map = new int[N][N];

		bw.write(backtracking(0, map) + "\n");

		bw.flush();
		
		br.close();
		bw.close();
	}
}
