import java.util.*;
import java.io.*;

class Steven{
	private static int N, K, max;

	public static void solution(String[] str, boolean[] select, int start, int cnt){
		if(cnt > K) return;
		
		if(cnt == K){
			int satisfied = 0;
			for(int i = 0 ; i < N ; i++){
				boolean flag = true;
				for(int j = 4 ; j < str[i].length() - 4 ; j++){
					if(!select[str[i].charAt(j) - 'a']){
						flag = false;
						break;
					}
				}

				if(flag) satisfied++;
			}

			max = Math.max(max, satisfied);
		}


		for(int i = start ; i < 26 ; i++){
			if(select[i]) continue;
			
			select[i] = true;
			solution(str, select, i + 1, cnt + 1);
			select[i] = false;
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		String[] str = new String[N];
		boolean[] select = new boolean[26];

		select['a'-'a'] = select['n'-'a'] = select['t'-'a'] = select['i'-'a'] = select['c'-'a'] = true;

		for(int i = 0 ; i < N ; i++){
			str[i] = br.readLine();
		}

		if(K < 5) bw.write(0 + "\n");
		else if(K == 26){
			bw.write(N + "\n");
		}
		else{
			solution(str, select, 0, 5);
			bw.write(max + "\n");
		}

		bw.flush();

		br.close();
		bw.close();

	}
}
