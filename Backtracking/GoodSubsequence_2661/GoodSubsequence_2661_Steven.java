import java.util.*;
import java.io.*;

class GoodSubsequence_2661{
	private static int N;
	public static boolean isSubsequencesDuplicated(String candidate){
		int len = candidate.length();

		/* i is the start of subsequence.
		 * j is the length of subsequence.
		 * */
		for(int i = 0 ; i < len ; i++){
			for(int j = 1 ; i + 2*j - 1 < len ; j++){
				/* If it's duplicated, return true. */
				if(candidate.substring(i, i+j).equals(candidate.substring(i+j, i+2*j)))
					return true;
			}
		}

		return false;
	}

	public static String makeTheSequence(String candidate){
		if(candidate.length() == N)
			return candidate;	
		
		String res = "";
		for(int i = 1 ; i <= 3 ; i++){
			/* If it doesn't find the result yet or its subsequences aren't duplicated, go next*/
			if(res.length() != N && !isSubsequencesDuplicated(candidate + i)){
				res = makeTheSequence(candidate + i);
			}
		}

		return res;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		bw.write(makeTheSequence("") + "\n");

		br.close();
		bw.close();
	}
}
