import java.util.*;
import java.io.*;

class H_5719 implements Comparable<H_5719>{
	private int vertax, weight;
	
	H_5719(int vertax, int weight){
		this.vertax = vertax;
		this.weight = weight;
	}

	public int getVertax() { return this.vertax; }
	public int getWeight() { return this.weight; }

	@Override
	public int compareTo(H_5719 o) { return this.weight - o.weight; }
}


class AlmostShortestDistance_5719{
	private static final int MAX = 987654321;
	private static int N, M, S, D;
	
	public static void dijkstra(int[][] map, int[] dist, List<H_5719>[] trace){
		PriorityQueue<H_5719> pq = new PriorityQueue<H_5719>();
		pq.offer(new H_5719(S, dist[S] = 0);

		while(!pq.isEmpty()){

		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = INteger.parseInt(st.nextToken());

			if(N == 0 && M == 0)
				break;

			st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			D = Integer.parseInt(st.nextToken());

			int[][] map = new int[N][N];
			int[] dist = new int[N];
			List<H_5719>[] trace = new ArrayList[];
			
			for(int i = 0 ; i < N ; i++){
				Arrays.fill(map[i], MAX);
				dist[i] = MAX;
				trace[i] = new ArrayList<>();
			}
			
			for(int i = 0 ; i < M ; i++){
				st = new StringTokenizer(br.readLine());
				int U = Integer.parseInt(st.nextToken());
				int V = Integer.parseInt(st.nextToken());
				int P = Integer.parseInt(st.nextToken());

				map[U][V] = P;
			}

			dijkstra(map, dist, trace);
	}



