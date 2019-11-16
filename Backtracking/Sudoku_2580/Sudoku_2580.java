import java.util.*;
import java.io.*;

class H_2580{
	private int row, col;
	
	H_2580(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	public int getRow() { return this.row; }
	public int getCol() { return this.col; }
}

class Sudoku_2580{
	private static int[][] map = new int[10][10];

	public static void setVisited(int row, int col, int[][] map, boolean[] visited){
		for(int i = 1 ; i < 10 ; i++){
			visited[map[row][i]] = visited[map[i][col]] = true;
		}

		if(row < 4) row = 1;
                else if(row < 7) row = 4;
                else row = 7;

                if(col < 4) col = 1;
                else if(col < 7) col = 4;
                else col = 7;

                for(int i = row ; i < row + 3 ; i++){
                        for(int j = col ; j < col + 3 ; j++){
                                visited[map[i][j]] = true;
                        }
                }
	}

	public static boolean backtracking(int now, List<H_2580> target){
		if(now == target.size()) 
			return true;
		
		boolean[] visited = new boolean[10];	
		
		int nowRow = target.get(now).getRow();
		int nowCol = target.get(now).getCol();

		setVisited(nowRow, nowCol, map, visited);
	
		for(int i = 1 ; i < 10 ; i++){
			if(!visited[i]){
				map[nowRow][nowCol] = i;
				if(backtracking(now + 1, target))
					return true;
				map[nowRow][nowCol] = 0;
			}
		}

		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<H_2580> target = new ArrayList<>();

		for(int i = 1 ; i < 10 ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j < 10 ; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 0)
					target.add(new H_2580(i, j));
			}
		}
		
		backtracking(0, target);
		
		for(int i = 1 ; i < 10 ; i++){
			for(int j = 1 ; j < 10 ; j++){
				bw.write(map[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
