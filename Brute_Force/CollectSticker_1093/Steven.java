import java.util.*;
import java.io.*;

class Steven{
	private static int N, K;

	public static int solve(int[][] map){
		int res = -1;
		int sumVal = 0, sumWorth = 0;
		int left = 0, right = 0;

		while(left <= right && right < N){
			if(map[right][0] == -1 && map[right][1] == -1){
				right++;
				continue;
			}

			sumVal+=map[right][0];
			sumWorth+=map[right][1];
				
			right++;
			
			if(sumWorth >= K){
				while(left <= right && sumWorth - map[left][1] >= K){
					if(map[left][0] == -1 && map[left][1] == -1){
						left++;
						continue;
					}
					sumVal-=map[left][0];
					sumWorth-=map[left][1];

					left++;
				}

				if(res == -1) res = sumVal;
				else res = Math.min(res, sumVal);
			}
		}

		return res;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		int[][] map = new int[N][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
			map[i][0] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++){
			map[i][1]= Integer.parseInt(st.nextToken());
		}

		Arrays.sort(map, new Comparator<int[]>(){
			public int compare(int[] a, int[] b){
				return Integer.compare(a[1], b[1]);
			}
		});

		K = Integer.parseInt(br.readLine());

		int cnt = Integer.parseInt(br.readLine());
		if(cnt > 0) st = new StringTokenizer(br.readLine());

		for(int i = 0 ; i < cnt ; i++){
			int val = Integer.parseInt(st.nextToken());
			K-=val;

			map[val][0] = map[val][1] = -1;
		}
		
		if(K <= 0) bw.write(0 + "\n");
		else bw.write(solve(map) + "\n");

		bw.flush();

		br.close();
		bw.close();

	}
}
