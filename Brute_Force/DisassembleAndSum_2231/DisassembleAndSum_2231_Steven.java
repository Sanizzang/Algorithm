import java.util.*;
import java.io.*;

class DisassembleAndSum_2231{
	private static int N;
	/* After calculating a Disassemble and sum (D), check that it equals to given N. */
	public static boolean isNumComposed(int num){
		char[] digits = String.valueOf(num).toCharArray();
		
		for(char digit : digits){
			num+=(digit - '0');
		}

		return num == N;
	}
	/* Try checking every numbers whether D or not. */
	public static int brute_force(){
		for(int i = 1 ; i <= N ; i++){
			if(isNumComposed(i)) return i;
		}

		return 0;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		int res = brute_force();

		bw.write(res + "\n");

		br.close();
		bw.close();
	}
}

