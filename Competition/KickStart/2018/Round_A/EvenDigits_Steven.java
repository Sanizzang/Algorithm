import java.util.*;
import java.io.*;

class EvenDigits_Steven{
	public static long solution(String N, long count, int posi){
		if(posi > N.length()) 
			return count;
		
		int digit = N.charAt(N.length() - posi);
		long num = Long.parseLong(N);

		System.out.println(num);

		if(digit % 2 == 0){
			count = Math.min(solution(N, count, posi + 1), count);
			count = Math.min(
		}
		
		else{
			long ten = (long)(Math.pow(10, posi - 1));
			long next1 = num + ten;
			long next2 = num - ten;

			count = Math.min(solution(next1 + "", count + Math.abs(num - next1), posi + 1), Math.min(solution(next2 + "", count + Math.abs(num - next2), posi + 1), count));
		}

		return count;
	}


	public static void main(String[] args) throws Exception{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = 1;//Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			String N = "2018";//br.readLine();
			bw.write(solution(N, 0, 1) + "\n");	
		}

		bw.flush();

		bw.close();
	}
}
