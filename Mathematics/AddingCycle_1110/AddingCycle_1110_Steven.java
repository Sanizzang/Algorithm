import java.util.*;
import java.io.*;

class AddingCycle_1110_Steven{
		
	public static int getCountingForCycle(int initNum){
		int count = 0;
		int N = initNum;

		while(true){
			int digit1 = N / 10, digit2 = N % 10, S = 0;
			
			if(N < 10) S = N;
			else S = digit1 + digit2;

			N = Integer.parseInt(digit2 + "" + (S % 10));

			count++;

			if(N == initNum) break;
		}
		
		return count;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		bw.write(getCountingForCycle(N) + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
