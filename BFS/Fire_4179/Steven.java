import java.util.*;
import java.io.*;

class Position{
	private int row, col;

	Position(int row, int col){
		this.row = row;
		this.col = col;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
}

class Steven{
	private static int R, C;
	private static Position person;

	private static Queue<Position> spread;
	private static int[] NR = new int[]{-1, 1, 0, 0};
	private static int[] NC = new int[]{0, 0, -1, 1};


	public static int solution(char[][] map){
		Queue<Position> move = new LinkedList<>();
		move.offer(person);

		int[][] visited = new int[R][C];
		visited[person.getRow()][person.getCol()] = 1;

		while(!move.isEmpty()){
			// fire spreads
			int fireSize = spread.size();

			for(int i = 0 ; i < fireSize ; i++){
				Position nowFire = spread.poll();
				int row = nowFire.getRow();
				int col = nowFire.getCol();

				for(int j = 0 ; j < 4 ; j++){
					int nextR = row + NR[j];
					int nextC = col + NC[j];
	
					if(nextR < 0 || nextR >= R || nextC < 0 || nextC >= C || map[nextR][nextC] == '#' || map[nextR][nextC] == 'F')
						continue;

					spread.offer(new Position(nextR, nextC));
					map[nextR][nextC] = 'F';
				}
			}
		
			//Person moves
			int personSize = move.size();

			for(int i = 0 ; i < personSize ; i++){
				Position nowPerson = move.poll();
				int row = nowPerson.getRow();
				int col = nowPerson.getCol();

				if(row == 0 || row == R - 1 || col == 0 || col == C - 1)
					return visited[row][col];
			

				for(int j = 0 ; j < 4 ; j++){
					int nextR = row + NR[j];
					int nextC = col + NC[j];

					if(nextR < 0 || nextR >= R || nextC < 0 || nextC >= C || map[nextR][nextC] != '.' || visited[nextR][nextC] != 0)
						continue;

					move.offer(new Position(nextR, nextC));
					visited[nextR][nextC] = visited[row][col] + 1;
				}
			}

		}

		return -1;

	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		char[][] map = new char[R][C];
		
		spread = new LinkedList<>();

		for(int i = 0 ; i < R ; i++){
			String in = br.readLine();
			for(int j = 0 ; j < in.length() ; j++){
				map[i][j] = in.charAt(j);
				if(map[i][j] == 'J') 
					person = new Position(i, j);
				if(map[i][j] == 'F')
					spread.offer(new Position(i, j));
			}
		}

		int res = solution(map);
		bw.write((res == -1 ? "IMPOSSIBLE" : res) + "\n");

		bw.flush();

		br.close();
		bw.close();

	}
}
