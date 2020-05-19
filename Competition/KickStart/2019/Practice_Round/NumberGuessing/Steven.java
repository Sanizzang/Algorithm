import java.util.*;
import java.io.*;

class Steven {
    public static int N;
    
    public static void solve(BufferedReader br, int a, int b, int cnt) throws Exception{
        if(cnt == N) return;
        
        int m = (a + b) / 2;
        
       	System.out.println(m);
        String word = br.readLine();
        
	if (word.equals("CORRECT")) 
		return;
	else if (word.equals("TOO_SMALL")) 
		solve(br, m + 1, b, cnt + 1);
        else 
            solve(br, a, m - 1, cnt + 1);
        
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int testCase = Integer.parseInt(br.readLine());
        
        while(testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(br.readLine());
            
            solve(br, A + 1, B, 0);
        }
    }
}
