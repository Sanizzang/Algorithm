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
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			H = sc.nextInt() * MAX;
			N = sc.nextInt();

			int[] legos = new int[N];

			for(int i = 0 ; i < N ; i++){
				legos[i] = sc.nextInt();
			}

			Arrays.sort(legos);

			int l1 = 0, l2 = 0;
			for(int i = 0 ; i < N - 1 ; i++){
				if(H - legos[i] > 0 && binarySearch(legos, i + 1, N - 1, H - legos[i])){
					l1 = legos[i];
					l2 = H - legos[i];
					break;
				}
			}

			if(l1 == 0 && l2 == 0) System.out.println("danger");
			else System.out.println("yes " + l1 + " " + l2);

		}

		sc.close();
	}

}
