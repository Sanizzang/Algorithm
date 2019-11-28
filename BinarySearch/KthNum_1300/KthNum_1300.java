import java.util.*;
import java.io.*;

class KthNum_1300{
	private static int N, K;
	public static int binarySearch(){
		int left = 1, right = K;
		while(left < right){
			int mid = (left + right) / 2;
			long cnt = 0;
			for(int i = 1 ; i <= N ; i++){
				cnt+=Math.min(mid / i, N);
			}

			if(cnt >= K) right = mid;	
			else left = mid + 1;
		}

		return right;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		
		bw.write(binarySearch() + "\n");

		bw.flush();
		br.close();
	}
}
