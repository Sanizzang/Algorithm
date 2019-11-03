import java.util.*;
import java.io.*;

class H_6593{
	int level, row, col;
	
	public H_6593(int level, int row, int col){
		this.level = level;
		this.row = row;
		this.col = col;
	}
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
			int nowL = now.level;
			int nowR = now.row;
			int nowC = now.col;

			if(nowL == dest.level && nowR == dest.row && nowC == dest.col)
				return move[dest.level][dest.row][dest.col];

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
		Scanner sc = new Scanner(System.in);

		while(true){
			L = sc.nextInt();
			R = sc.nextInt();
			C = sc.nextInt();
			
			if(L == 0 && R == 0 && C == 0)
				break;

			char[][][] map = new char[L][R][C];
			
			for(int i = 0 ; i < L ; i++){
				for(int j = 0 ; j < R ; j++){
					String temp = sc.next();
					for(int k = 0 ; k < C ; k++){
						map[i][j][k] = temp.charAt(k);
						if(map[i][j][k] == 'S')
							start = new H_6593(i, j, k);
						if(map[i][j][k] == 'E')
							dest = new H_6593(i, j, k);
					}
				}
			}
			
			int res = bfs(map);
			if(res == -1) System.out.println("Trapped!");
            		else System.out.println("Escaped in " + res + " minute(s).");
		}
		sc.close();
	}
}
