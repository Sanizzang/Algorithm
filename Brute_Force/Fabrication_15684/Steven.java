import java.util.*;
import java.io.*;

class Steven{
	private static int R, C, M, res;


	public static boolean labber(boolean[][] map, int startCol){
		int i = 1;
		int j = startCol;

		while(i <= R){
			if(map[i][j]) j++;
			else if(j - 1 >= 0 && map[i][j-1]) j--;
			
			i++;
		}

		return startCol == j;
	}

	public static void backtracking(boolean[][] map, int startRow, int startCol, int cnt){
		if(cnt > 3) return; 
		
		if(res == -1 || cnt < res){
			boolean flag = true;
			for(int j = 1 ; j <= C ; j++){
				if(!labber(map, j)){
					flag = false;
					break;
				}
			}

			if(flag) {
				res = cnt;
				return;
			}
		}

		for(int i = startRow ; i <= R ; i++){
			if(i > startRow) startCol = 1;
			for(int j = startCol ; j < C ; j++){
				if(map[i][j] || (j - 1 >= 0 && map[i][j-1])) 
					continue;
				

				map[i][j] = true;
				backtracking(map, i, j, cnt + 1);
				map[i][j] = false;
			}
		}
	
		return;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		boolean[][] map = new boolean[R+1][C+1];
		for(int i = 1 ; i <= M ; i++){
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			map[first][second] = true;
		}

		res = -1;
		backtracking(map, 1, 1, 0);

		bw.write(res + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
