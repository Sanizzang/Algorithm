import java.util.*;
import java.io.*;

class ImmigrationExamination_3079{
	private static int N;
	private static long M, max;
	public static long binarySearch(int[] desks){
		long left = 1, right = M * max;
		
		/* "Every sum of T(k) | taking time for all the poeple should be the number of poeple" */
		
		while(left < right){
			/* Assuming that we know the taking time for all the poeple as mid in binary search. */
			long mid = (left + right) / 2;
			
			long sum = 0;
			
			/* Get the number of people */
			for(int i = 0 ; i < N ; i++){
				sum+=(mid / desks[i]);
			}
			
			/* If is's less than M, left should be mid + 1 */
			if(M > sum) left = mid + 1;
			/* else right should be mid */
			else right = mid;
		}

		/* As a result, we can get the minimum time */
		return right;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Long.parseLong(st.nextToken());
		
		int[] desks = new int[N];
		for(int i = 0 ; i < N ; i++){
			desks[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, desks[i]);	
		}
		
		bw.write(binarySearch(desks) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
