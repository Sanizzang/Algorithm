import java.util.*;
import java.io.*;

class H_1726{
	private int row, col, direction;
	H_1726(int row, int col, int direction){
		this.row = row;
		this.col = col;
		this.direction = direction;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
	public int getDirection() { return this.direction; }
}

class Robot_1726{
	private static int M, N;
	private static H_1726 start, dest;
	private static int[][] directions = new int[][] {{},{-1, 2, 1, 1}, {2, -1, 1, 1}, {1, 1, -1, 2}, {1, 1, 2, -1}};
	public static void bfs(){


	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		int[][] map = new int[M+1][N+1];
		for(int i = 1 ; i <= M ; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j <= N ; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		start = new H_1726(br.readLine(st.nextToken()), br.readLine(st.nextToken()), br.readLine(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		dest = new H_1726(br.readLine(st.nextToken(), br.readLine(st.nextToken()), br.readLine(st.nextToken()));
	}
}
