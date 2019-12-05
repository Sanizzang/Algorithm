import java.util.*;
import java.io.*;

class GuitarLesson_2343{
	private static int N, M, max;

	public static long binarySearch(int[] lessons){
		long left = max, right = 1000000000 / M;

		while(left < right){
			long mid = (left + right) / 2;
			
			int cnt = 0;
			long sum = 0;

			for(int i = 0 ; i < N ; i++){
				sum+=lessons[i];

				if(sum > mid){
					cnt++;
					sum = lessons[i];
				}
			}

			if(sum <= mid) cnt++;

			if(cnt > M) left = mid + 1;
			else right = mid;
		}

		return right;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int[] lessons = new int[N];

		st = new StringTokenizer(br.readLine());	
		
		for(int i = 0 ; i < N ; i++){
			lessons[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, lessons[i]);
		}
		
		bw.write(binarySearch(lessons) + "\n");

		bw.flush();
		
		br.close();
		bw.close();
	}

}
