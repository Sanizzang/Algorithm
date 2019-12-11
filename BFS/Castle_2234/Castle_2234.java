import java.util.*;
import java.io.*;

class H_2234{
	private int row, col;

	H_2234(int row, int col){
		this.row = row;
		this.col = col;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
}

class Castle_2234{
	private static int R, C;
	
	private static int[] NR = new int[]{0, -1, 0, 1};
	private static int[] NC = new int[]{-1, 0, 1, 0};

	public static int BFS(int[][] map, boolean[][] visited, int row, int col){
		visited[row][col] = true;

		Queue<H_2234> q = new LinkedList<>();
		q.offer(new H_2234(row, col));

		int size = 0;

		while(!q.isEmpty()){
			H_2234 now = q.poll();
			int nowRow = now.getRow();
			int nowCol = now.getCol();

			size++;

			for(int i = 0 ; i < 4 ; i++){
				int nextR = nowRow + NR[i];
				int nextC = nowCol + NC[i];

				if((map[nowRow][nowCol] & (1 << i)) > 0) continue;

				if(nextR >= 0 && nextR < R && nextC >= 0 && nextC < C && !visited[nextR][nextC]){
					q.offer(new H_2234(nextR, nextC));
					visited[nextR][nextC] = true;
				}
			}
		}

		return size;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		C = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		int[][] map = new int[R][C];

		for(int i = 0 ; i < R ; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < C ; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] visited = new boolean[R][C];

		int cnt = 0;

		int maxSize = 0;
		for(int i = 0 ; i < R ; i++){
			for(int j = 0 ; j < C ; j++){
				if(!visited[i][j]){
					cnt++;
					maxSize = Math.max(maxSize, BFS(map, visited, i, j));
				}
			}
		}

		bw.write(cnt + "\n" + maxSize);

		bw.flush();

		br.close();
		bw.close();
	}
}
