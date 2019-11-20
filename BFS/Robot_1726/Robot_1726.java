import java.util.*;
import java.io.*;

class H_1726{
	private int row, col, direction, move;
	H_1726(int row, int col, int direction, int move){
		this.row = row;
		this.col = col;
		this.direction = direction;
		this.move = move;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
	public int getDirection() { return this.direction; }
	public int getMove() { return this.move; }
}

class Robot_1726{
	private static int M, N;
	private static H_1726 start, dest;
	private static int[][] directions = new int[][] {{},{0, -1, 2, 1, 1}, {0, 2, -1, 1, 1}, {0, 1, 1, -1, 2}, {0, 1, 1, 2, -1}};
	private static int[] NR = new int[] {0, 0, 0, 1, -1};
	private static int[] NC = new int[] {0, 1, -1, 0, 0};

	public static int bfs(int[][] map){
		Queue<H_1726> q = new LinkedList<>();
		boolean[][][] visited = new boolean[M+1][N+1][5];

		q.offer(new H_1726(start.getRow(), start.getCol(), start.getDirection(), 0));
		visited[0][0][start.getDirection()] = true;

		while(!q.isEmpty()){
			H_1726 now = q.poll();
			int row = now.getRow();
			int col = now.getCol();
			int direction = now.getDirection();
			int move = now.getMove();

			if(row == dest.getRow() && col == dest.getCol() && direction == dest.getDirection())
				return move;
			
			for(int i = 1 ; i <= 3 ; i++){
				int nextR = row + NR[direction] * i;
				int nextC = col + NC[direction] * i;
				
				if(nextR < 1 || nextR > M || nextC < 1 || nextC > N) continue;
				if(map[nextR][nextC] == 1) break;

				if(!visited[nextR][nextC][direction]){
					visited[nextR][nextC][direction] = true;	
					q.offer(new H_1726(nextR, nextC, direction, move + 1));
				}
			}
			
			for(int i = 1 ; i <= 4 ; i++){
				if(visited[row][col][i])
					continue;
				
				visited[row][col][i] = true;
				q.offer(new H_1726(row, col, i, move + directions[direction][i]));
			}
		}

		return -1;
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
		start = new H_1726(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
		st = new StringTokenizer(br.readLine());
		dest = new H_1726(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);

		bw.write(bfs(map) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
