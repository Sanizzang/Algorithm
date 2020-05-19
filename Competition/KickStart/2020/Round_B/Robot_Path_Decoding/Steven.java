import java.util.*;
import java.io.*;

// direction[0] = East
// direction[1] = West
// direction[2] = South
// direction[3] = North
class Steven{
	private static final int MAX_SIZE = 1000000000;
	
	public static long[] solve(char[] s, boolean[] visited, long[] direction, int now){
		if(now == s.length)
			return direction;

		if(!visited[now]){
			visited[now] = true;
			
			if(s[now] == '('){
				long[] nDirect = solve(s, visited, new long[4], now + 1);
				
				long mul = s[now - 1] - '0';
				for(int i = 0 ; i < 4 ; i++){
					if(nDirect[i] == 0) continue; 

					nDirect[i]*=mul;
					direction[i]+=nDirect[i];

					if(direction[i] <= 0) 
						direction[i] = direction[i] + MAX_SIZE;
					else if(direction[i] > MAX_SIZE)
						direction[i] = direction[i] % MAX_SIZE;

				}

			}

			else if(s[now] == ')')
				return direction;		
		
			if(s[now] == 'E') direction[0]++;
			else if(s[now] == 'W') direction[1]++;
			else if(s[now] == 'S') direction[2]++;
			else if(s[now] == 'N') direction[3]++;
		}


		return solve(s, visited, direction, now + 1);
	}

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = in.nextInt();

		in.nextLine();
		for(int t = 1 ; t <= testCase ; t++){
			char[] s = in.nextLine().toCharArray();
			boolean[] visited = new boolean[s.length];

			long[] res = solve(s, visited, new long[4], 0);
						
			long x = (res[0] - res[1]) + 1;
			long y = (res[2] - res[3]) + 1;

			if(res[1] != 0 && x <= 0) x = x + MAX_SIZE;
			else if(res[0] != 0 && x > MAX_SIZE) x = x % MAX_SIZE;
			if(res[3] != 0 && y <= 0) y = y + MAX_SIZE;
			else if(res[2] != 0 && y > MAX_SIZE) y = y % MAX_SIZE;

			bw.write("Case #" + t + ": " + x + " " + y + "\n");
		}

		bw.flush();

		in.close();
		bw.close();

	}
}





