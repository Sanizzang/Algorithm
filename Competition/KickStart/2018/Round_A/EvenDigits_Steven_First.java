import java.util.*;
import java.io.*;

class Number{
	private int N, count;

	Number(int N, int count) { 
		this.N = N; 
		this.count = count;
	}

	public int getNumber() { return this.N; }
	public int getCount() { return this.count; }
}

class EvenDigits_Steven{
	private static boolean[] oddDigits = new boolean[]{false, true, false, true, false, true, false, true, false, true};
	
	public static boolean AreDigitsOdd(String n){
		for(int i = 0 ; i < n.length() ; i++){
			if(oddDigits[n.charAt(i) - '0']) return false;
		}

		return true;
	}
	public static int solution(int start){
		Queue<Number> q = new LinkedList<>();
		boolean[] visited = new boolean[1000000];
	
		q.offer(new Number(start, 0));
		visited[start] = true;

		while(!q.isEmpty()){
			Number n = q.poll();

			int num = n.getNumber();
			int count = n.getCount();

			if(AreDigitsOdd(num + "")) return count;
			
			if(num == 0) continue;
			if(!visited[num + 1]){
				visited[num + 1] = true;
				q.offer(new Number(num + 1, count + 1));
			}
			if(!visited[num - 1]){
				visited[num - 1] = true;
				q.offer(new Number(num - 1, count + 1));
			}
		}

		return -1;
	}


	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		int i = 1;

		while(testCase-- > 0){
			int N = Integer.parseInt(br.readLine());
			bw.write("Case #" + i + ": " + solution(N) + "\n");

			i++;
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
