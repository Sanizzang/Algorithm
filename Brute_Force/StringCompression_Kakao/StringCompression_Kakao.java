import java.util.*;
import java.io.*;

class StringCompression_Kakao{
	private static String S;
	public static int bruteForce(int N){
		int res = N;
		for(int k = 1 ; k <= N/2 ; k++){
			String candidate, keep;
			candidate = keep = "";
			int cnt = 1;

			for(int i = 0 ; i < N ; i = i + k){
				if(i + 2 * k <= N && S.substring(i, i + k).equals(S.substring(i + k, i + 2 * k))){
					keep = S.substring(i, i + k);
					cnt++;
				}

				else{
					if(i + k <= N && cnt == 1) 
						candidate = candidate + S.substring(i, i + k);
					
					else if(i + k > N && cnt == 1)
						candidate = candidate + S.substring(i);

					else if(cnt > 1){
						candidate = candidate + cnt + keep;
						cnt = 1;
					}
				}
			}

			if(candidate != "") 
				res = Math.min(res, candidate.length());
		}

		return res;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		S = br.readLine();

		bw.write(bruteForce(S.length()) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
