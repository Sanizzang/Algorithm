import java.util.*;
import java.io.*;

class H_3184{
	private int row, col;
	private char type;

	H_3184(int row, int col, char type){
		this.row = row;
		this.col = col;
		this.type = type;
	}

	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
	public char getType() { return this.type; }
}

class Sheep_3184{
	private static int R, C;
	private static int totalSheep, totalWolf;

	private static int[] NR = new int[]{ -1, 1, 0, 0 };
	private static int[] NC = new int[]{ 0, 0, -1, 1 };

	public static void bfs(char[][] field, boolean[][] visited, H_3184 animal){
		Queue<H_3184> q = new LinkedList<>();
		int sheeps = 0, wolfs = 0;
		
		q.offer(animal);
		visited[animal.getRow()][animal.getCol()] = true;

		while(!q.isEmpty()){
			H_3184 now = q.poll();
			int row = now.getRow();
			int col = now.getCol();
			char type = now.getType();

			if(type == 'o') sheeps++;
			else if(type == 'v') wolfs++;

			for(int i = 0 ; i < 4 ; i++){
				int nextR = row + NR[i];
				int nextC = col + NC[i];
				if(nextR >= 0 && nextR < R && nextC >= 0 && nextC < C && field[nextR][nextC] != '#' && !visited[nextR][nextC]){
					q.offer(new H_3184(nextR, nextC, field[nextR][nextC]));
					visited[nextR][nextC] = true;
				}
			}
		}
		
		if(sheeps > wolfs) totalSheep+=sheeps;
		else totalWolf+=wolfs;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		char[][] field = new char[R][C];
		List<H_3184> animals = new ArrayList<>();

		for(int i = 0 ; i < R ; i++){
			String line = br.readLine();
			for(int j = 0 ; j < C ; j++){
				field[i][j] = line.charAt(j);
				if(field[i][j] == 'o' || field[i][j] == 'v')
					animals.add(new H_3184(i, j, field[i][j]));
			}
		}
		
		boolean[][] visited = new boolean[R][C];
		for(H_3184 animal : animals){
			if(visited[animal.getRow()][animal.getCol()]) 
				continue;
	
			bfs(field, visited, animal);
		}

		bw.write(totalSheep + " " + totalWolf + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
