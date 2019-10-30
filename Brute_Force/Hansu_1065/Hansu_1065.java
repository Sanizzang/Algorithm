import java.util.*;
import java.io.*;

class Hansu_1065{
	public static int countArithmeticNum(int N){
		int res = 0;
		int[] cipher = new int[3];
		/* Don't conclude 1000 because this function supposed to be only checking under 1000. */
		for(int i = 100 ; i <= N && i != 1000 ; i++){
			int now = i;
			int posi = 2;
			/* Make a piece by cipher like 123 would be 1, 2, 3. */
			while(now > 0){
				cipher[posi] = now % 10;
				now/=10;
				posi--;
			}
			/* Check if three ciphers equals each other. */
			if(cipher[2] - cipher[1] == cipher[1] - cipher[0])
				res++;
		}

		return res + 99;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		if(N < 100) 
			bw.write(N + "\n");
		else 
			bw.write(countArithmeticNum(N) + "\n");
		
		bw.flush();

		br.close();
		bw.close();
	}
}
