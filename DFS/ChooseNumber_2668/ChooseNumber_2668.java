import java.util.*;
import java.io.*;

public class ChooseNumber_2668{
	private static List<Integer> res = new ArrayList<>();
	private static int N;

	public static void dfs(int now, int[] nums, boolean[] visited, boolean[] finish){
		if(visited[now]) return;
		visited[now] = true;

		int next = nums[now];
		if(!visited[next])
			dfs(next, nums, visited, finish);

		else if(!finish[next]){
			res.add(now);
			for(int i = nums[now] ; i != now ; i = nums[i]){
				res.add(i);
			}
		}
	
		finish[now] = true;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());

		int[] nums = new int[N+1];
		for(int i = 1 ; i <= N ; i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		boolean[] visited = new boolean[N+1];
		boolean[] finish = new boolean[N+1];
		for(int i = 1 ; i <= N ; i++){
			dfs(i, nums, visited, finish);
		}

		Collections.sort(res);
		bw.write(res.size() + "\n");

		for(int num : res){
			bw.write(num + "\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
