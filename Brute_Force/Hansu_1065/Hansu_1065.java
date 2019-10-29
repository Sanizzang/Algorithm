import java.util.*;
import java.io.*;

class Hansu_1065{
	public static int countArithmeticNum(int N, boolean[] isArithmetic){
		int[] cipher = new int[3];
		if(N == 1000) return 144;
		for(int i = 100 ; i <= N ; i++){
			int now = i;
			int posi = 2;
			while(now > 0){
				cipher[posi] = now % 10;
				now/=10;
				posi--;
			}
			if(cipher[2] - cipher[1] == cipher[1] - cipher[0])
				isArithmetic[i] = true;
		}

		int res = 0;
		for(boolean isAri : isArithmetic){
			if(isAri) res++;
		}

		return res + 99;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		boolean[] isArithmetic = new boolean[1001];
		if(N < 100) 
			bw.write(N + "\n");
		else 
			bw.write(countArithmeticNum(N, isArithmetic) + "\n");
		
		bw.flush();

		br.close();
		bw.close();
	}
}
