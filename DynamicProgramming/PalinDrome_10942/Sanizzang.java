/*
 * Date: 2020.08.14
 * Writer: Sanizzang
 */
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
            int N = Integer.parseInt(br.readLine()); // scan.nextInt();
		
	    int[] nums = new int[N + 1];
 	    int[][] visit = new int[N + 1][N + 1];
		
            StringTokenizer st = new StringTokenizer(br.readLine());
 		
 	    for(int i = 1;i < N + 1;i++){
 		    int num = Integer.parseInt(st.nextToken()); //(br.readLine());// scan.nextInt();
		    nums[i] = num;
		    visit[i][i] = 1;
		}
	    
	    for(int i = 1;i < N;i++){
	        if(nums[i] == nums[i + 1]){
	            visit[i][i + 1] = visit[i + 1][i] = 1;
	        }
	    }
	    
	    for(int i = 2;i < N;i++){
	        for(int j = 1;j <= N - i;j++){
	            if((visit[j + 1][i + j - 1] == 1) && (nums[j] == nums[i + j])){
	                visit[j][i + j] = visit[i + j][j] = 1;
	            }
	        }
	    }
	    
	    int q = Integer.parseInt(br.readLine());
	    
	    for(int i = 0;i < q;i++){
	        st = new StringTokenizer(br.readLine());
	        
	        int S = Integer.parseInt(st.nextToken());
	        int E = Integer.parseInt(st.nextToken());
	        
	        bw.write(visit[S][E] + "\n");
	    }
	    
	    bw.flush();
	    
	    br.close();
	    bw.close();
	}
}

/*
 * Description:
 * First, distinguish palindromes when the value of S - E is 0 or 1.
 * How to distinguish palindromes with a sequence size of 3 or more is divided into whether S + 1 and E - 1 are palindromes
 * and S, E are the same values.
 * The reason why S + 1 and E - 1 are palindrome is because the values of S + 2 and E - 2 have already been
 * confirmed to be palindrome.
 */
