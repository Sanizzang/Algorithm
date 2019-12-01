import java.util.*;
import java.io.*;

class SumOfFourIntegersToZero_7453{
	private static int N;
	
	public static void setCombinations(int[] arr1, int[] arr2, int[] combinations){
		int posi = 0;
		
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < N ; j++){
				combinations[posi++] = arr1[i] + arr2[j];
			}
		}
	}

	public static int lowerBound(int target, int[] combinations){
		int left = 0, right = N*N;
		while(left < right){
			int mid = (left + right) / 2;
			
			if(combinations[mid] < target)
				left = mid + 1;
			else 
				right = mid;
		}

		return right;
	}

	public static int upperBound(int target, int[] combinations){
		int left = 0, right = N*N;
		
		while(left < right){
			int mid = (left + right) / 2;

			if(combinations[mid] <= target)
				left = mid + 1;
			else
				right = mid;
		}

		return right;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		int[] D = new int[N];
		
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
			C[i] = Integer.parseInt(st.nextToken());
			D[i] = Integer.parseInt(st.nextToken());
		}

		int[] combinations1 = new int[N*N];
		int[] combinations2 = new int[N*N];
		
		/* set each combinations from two arrays */
		setCombinations(A, B, combinations1);
		setCombinations(C, D, combinations2);

		Arrays.sort(combinations1);
		Arrays.sort(combinations2);
		
		long res = 0;
		/* There could exist multiple cases to equal zero. 
		 * the number of the case should be (the postion at the target + 1) - (the postion of target at the leftmost) !
		 *  */
		for(int i = 0 ; i < N * N ; i++){
			res+=(upperBound(-combinations1[i], combinations2) - lowerBound(-combinations1[i], combinations2));
		}

		bw.write(res + "\n");

		br.close();
		bw.close();
	}
}
