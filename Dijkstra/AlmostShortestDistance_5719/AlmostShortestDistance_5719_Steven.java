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
	
	public static void dijkstra(int[][] map, int[] dist, List<Integer>[] trace){
		PriorityQueue<H_5719> pq = new PriorityQueue<H_5719>();
		pq.offer(new H_5719(S, dist[S] = 0));

		while(!pq.isEmpty()){
			H_5719 now = pq.poll();
			int nowVertax = now.getVertax();
			int nowWeight = now.getWeight();

			for(int next = 0 ; next < N ; next++){
				/* If there is no way to go from a current vertax to a next vertax 
				 * then, it should pass to another vertax.
				 *
				 * If the distance of a next vertax is smaller than a current weight + the distance from
				 * nowVertax to next vertax. then, it should pass either.
				 *
				 * */
				if(map[nowVertax][next] == MAX || nowWeight + map[nowVertax][next] > dist[next])
					continue;

				/* trace supposed to be the collection of paths to get to the destination consisting of
				 * the shorest ways
				 * */
				pq.offer(new H_5719(next, dist[next] = nowWeight + map[nowVertax][next]));
				trace[next].add(nowVertax);
			}
		}
	}

	public static void traceback(int[][] map, int[] dist, List<Integer>[] trace){
		Queue<Integer> q = new LinkedList<>();
		q.offer(D);
		while(!q.isEmpty()){
			int now = q.poll();
			for(Integer pre : trace[now]){
				if(dist[now] == dist[pre] + map[pre][now]){
					map[pre][now] = MAX;
					q.offer(pre);
				}
			
			}
		}

	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			if(N == 0 && M == 0)
				break;

			st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			D = Integer.parseInt(st.nextToken());

			int[][] map = new int[N][N];
			int[] dist = new int[N];
			List<Integer>[] trace = new ArrayList[N];
			
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
			/* Find shortest paths */
			dijkstra(map, dist, trace);
			/* Delete shortest paths */
			traceback(map, dist, trace);
			Arrays.fill(dist, MAX);
			/* Find new shortest paths */
			dijkstra(map, dist, trace);

			bw.write((dist[D] == MAX ? -1 : dist[D]) + "\n");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}



