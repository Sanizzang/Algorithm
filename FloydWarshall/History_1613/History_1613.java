import java.util.*;
import java.io.*;

class History_1613{
	private static int N, K, S;
	public static void floydWarshall(int[][] map){
		for(int k = 0 ; k <= N ; k++){
			for(int i = 0 ; i <= N ; i++){
				for(int j = 0 ; j <= N ; j++){
					if(map[i][j] == 0){
						if(map[i][k] == -1 && map[k][j] == -1)
							map[i][j] = -1;
						if(map[i][k] == 1 && map[k][j] == 1)
							map[i][j] = 1;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N+1][N+1];

		for(int i = 0 ; i < K ; i++){
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			map[first][second] = -1;
			map[second][first] = 1;
		}

		floydWarshall(map);

		S = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < S ; i++){
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			bw.write(map[first][second] + "\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}
}

