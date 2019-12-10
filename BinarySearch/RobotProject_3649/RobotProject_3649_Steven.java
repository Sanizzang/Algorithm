import java.util.*;
import java.io.*;

class RobotProject_3649_Steven{
	private static int H, N;
	private static final int MAX = 10000000;
	
	public static boolean binarySearch(int[] legos, int left, int right, int target){
		while(left <= right){
			int mid = (left + right) / 2;
			
			if(legos[mid] == target) return true;
			else if(legos[mid] < target) left = mid + 1;
			else right = mid - 1;
		}

		return false;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input;
		
		while((input = br.readLine()) != null){
			H = Integer.parseInt(input) * MAX;
			N = Integer.parseInt(br.readLine());

			int[] legos = new int[N];

			for(int i = 0 ; i < N ; i++){
				legos[i] = Integer.parseInt(br.readLine());
			}

			Arrays.sort(legos);

			int l1 = 0, l2 = 0;
			for(int i = 0 ; i < N - 1 ; i++){
				/* If H - legos[i] > 0, H - legos[i] could exist in the legos 
				 * Find (H - l(k)) in range of (k + 1) to N - 1
				 * 	because, definition of l is l2 >= l1
				 * */
				if(H - legos[i] > 0 && binarySearch(legos, i + 1, N - 1, H - legos[i])){
					l1 = legos[i];
					l2 = H - legos[i];
					break;
				}
			}

			if(l1 == 0 && l2 == 0) bw.write("danger" + "\n");
			else bw.write("yes " + l1 + " " + l2 + "\n");

		}

		bw.flush();

		br.close();
		bw.close();
	}

}
