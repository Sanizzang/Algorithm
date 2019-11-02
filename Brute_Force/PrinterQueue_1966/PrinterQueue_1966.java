import java.util.*;
import java.io.*;

class H_1966{
	int value, targetIndex;
	
	H_1966(int value, int targetIndex){
		this.value = value;
		this.targetIndex = targetIndex;
	}

	public int getValue() { return this.value; }
	public int getTargetIdx() { return this.targetIndex; }
}

public class PrinterQueue_1966{
	public static int bruteForce(int N, int M, int[] impo){
		Queue<H_1966> q = new LinkedList<>();
		for(int i = 0 ; i < N ; i++){
			if(i == M) q.offer(new H_1966(impo[i], i));
			else q.offer(new H_1966(impo[i], -1));
		}
		
		int cnt = 0;
		while(!q.isEmpty()){
			H_1966 now = q.poll();
			for(H_1966 next : q){
				if(next.getValue() > now.getValue()){
					q.offer(now);
					break;
				}
			}
			
			if(q.size() == N - 1 && now.getTargetIdx() == M)
				return cnt + 1;
			
			else if(q.size() == N - 1){
				N = q.size();
				cnt++;
			}
		}

		return -1;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		while(testCase-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] impo = new int[N];
			st = new StringTokenizer(br.readLine());

			for(int i = 0 ; i < N ; i++){
				impo[i] = Integer.parseInt(st.nextToken());
			}

			bw.write(bruteForce(N, M, impo) + "\n");
		}

		bw.flush();

		br.close();
		bw.close();
	}
}
