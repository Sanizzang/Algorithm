import java.util.*;
import java.io.*;

class ChessBoard_1018_Steven{
	private static int N, M;

	public static int bruteForce(char[][] origin, int startRow, int startCol, char mark){
		int cnt = 0;
		char[][] map = new char[9][9];
		
		/* copy original chess board to map consisting 8*8 size. */
		for(int i = startRow ; i <= startRow + 7 ; i++){
			for(int j = startCol ; j <= startCol + 7 ; j++){
				map[i-startRow+1][j-startCol+1] = origin[i][j];
			}
		}
		
		for(int i = 1 ; i <= 8 ; i++){
			/* keep the pattern that is alternatively changed. */
			if(mark == 'W' && mark == map[i-1][1]) mark = 'B';
			else if(mark == 'B' && mark == map[i-1][1]) mark = 'W';
			
			for(int j = 1 ; j <= 8 ; j++){
				if(map[i][j] != mark) {
					map[i][j] = mark;
					cnt++;
				}

				mark = mark == 'W' ? 'B' : 'W';
			}
		}
		
		return cnt;

	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		char[][] map = new char[N][M];
		for(int i = 0 ; i < N ; i++){
			map[i] = br.readLine().toCharArray();
		}
		
		int res = Integer.MAX_VALUE;
		for(int i = 0 ; i + 7 < N ; i++){
			for(int j = 0 ; j + 7 < M ; j++){
				res = Math.min(res, Math.min(bruteForce(map, i, j, 'W'), bruteForce(map, i, j, 'B')));
			}
		}
		bw.write(res + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
