import java.util.*
import java.io.*;

class H_1600{
	private int row, col, horse, move;
	
	H_1600(int row, int col, int horse, int move){
		this.row = row;
		this.col = col;
		this.horse = horse;
		this.move = move;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
	public int getHorse() { return this.horse; }
	public int getMove() { return this.move; }

}

class TheMonkey_1600{
	private static int K, W, H;
	private static int[] NR = new int[]{ -1, 1, 0, 0, -1, -2, -2, -1, 1, 2, 2, 1 };
	private static int[] NC = new int[]{ 0, 0, -1, 1, -2, -1, 1, 2, 2, 1, -1, -2 };
	
	public static int bfs(int[][] map){
		Queue<H_1600> q = new LinkedList<>();
		/* Visited is checking the position each row, column and espeically how many times it moves like a horse. */
		boolean[][][] visited = new boolean[H][W][K+1];
		q.offer(new H_1600(0, 0, 0, 0));
		visited[0][0][0] = true;

		while(!q.isEmpty()){
			/* cntHorse is how many times it moves like a horse so far.
			 * move is how many times it moves.
			 * */
			H_1600 now = q.poll();
			int row = now.getRow();
			int col = now.getCol();
			int cntHorse = now.getHorse();
			int move = now.getMove();

			if(row == H - 1 && col == W - 1)
				return move;
			/* Move like a monkey */
			for(int i = 0 ; i < 4 ; i++){
				int nextR = row + NR[i];
				int nextC = col + NC[i];
				/* When it moves like a monkey. don't need to add 1 to cntHorse. just count 1 for move */
				if(nextR >= 0 && nextR < H && nextC >= 0 && nextC < W && map[nextR][nextC] == 0 && !visited[nextR][nextC][cntHorse]){
					q.offer(new H_1600(nextR, nextC, cntHorse, move + 1));
					visited[nextR][nextC][cntHorse] = true;
				}
			}
			/* Move like a horse */
			for(int i = 4 ; i < 12 ; i++){
				int nextR = row + NR[i];
				int nextC = col + NC[i];
				
				/* When cntHorse is more than the limitation K, it should pass to next one. */
				if(cntHorse + 1 > K) continue;
				/* When it moves like a horse, it needs to add 1 to cntHorse. also count 1 for move*/
				if(nextR >= 0 && nextR < H && nextC >= 0 && nextC < W && map[nextR][nextC] == 0 && !visited[nextR][nextC][cntHorse + 1]){
					q.offer(new H_1600(nextR, nextC, cntHorse + 1, move + 1));
					visited[nextR][nextC][cntHorse + 1] = true;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		K = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		int[][] map = new int[H][W];
		for(int i = 0 ; i < H ; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < W ; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bw.write(bfs(map) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
	
}
