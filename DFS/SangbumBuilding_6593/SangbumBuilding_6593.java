import java.util.*;
import java.io.*;

class H_6593{
	private int level, row, col;
	
	H_6593(int level, int row, int col){
		this.level = level;
		this.row = row;
		this.col = col;
	}
	
	public int getLevel() { return this.level; }
	public int getRow()  { return this.row; }
	public int getCol()  { return this.col; }

}

public class SangbumBuilding_6593{
	private static int[] nextL = new int[]{-1, 1, 0, 0, 0, 0};
	private static int[] nextR = new int[]{0, 0, -1, 1, 0, 0};
	private static int[] nextC = new int[]{0, 0, 0, 0, -1, 1};
	
	private static int L, R, C;
	private static H_6593 start = null, dest = null;
	
	public static int bfs(char[][][] map){
		Queue<H_6593> q = new LinkedList<>();
		q.offer(start);
		
		int[][][] move = new int[L][R][C];

		while(!q.isEmpty()){
			H_6593 now = q.poll();
			int nowL = now.getLevel();
			int nowR = now.getRow();
			int nowC = now.getCol();

			if(map[nowL][nowR][nowC] == 'E')
				return move[nowL][nowR][nowC];

			for(int i = 0 ; i < 6 ; i++){
				int NL = nowL + nextL[i];
				int NR = nowR + nextR[i];
				int NC = nowC + nextC[i];
					
				if(NL < 0 || NL >= L || NR < 0 || NR >= R || NC < 0 || NC >= C || map[NL][NR][NC] == '#' || move[NL][NR][NC] != 0) 
					continue;
				
				q.offer(new H_6593(NL, NR, NC));
				move[NL][NR][NC] = move[nowL][nowR][nowC] + 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			
			if(L == 0 && R == 0 && C == 0)
				break;

			char[][][] map = new char[L][R][C];
			
			for(int x = 0 ; x < L ; x++){
				for(int y = 0 ; y < R ; y++){
					char[] temp = br.readLine().toCharArray(); 
					for(int z = 0 ; z < C ; z++){
						map[x][y][z] = temp[z];
						if(map[x][y][z] == 'S') start = new H_6593(x, y, z);
						if(map[x][y][z] == 'E') dest = new H_6593(x, y, z);
					}
				}
				br.readLine();
			}
			
			int res = bfs(map);
			if(res == -1) System.out.println("Trapped!");
            		else System.out.println("Escaped in " + res + " minute(s).");
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
