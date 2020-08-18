/*
 * Date: 2020.08.18
 * Writer: Sanizzang
 */
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int N = Integer.parseInt(br.readLine());
	    long[][] stairs = new long[N + 1][10];
	    
	    for(int i = 1;i < 10;i++){
	        stairs[1][i] = 1;
	    }
	    
	    for(int i = 1;i < N;i++){
	        for(int j = 0;j < 10;j++){
	            if(j == 0){
	                stairs[i + 1][j + 1] += stairs[i][j];
	                stairs[i + 1][j + 1] %= 1000000000;

	                stairs[i][j] = 0;
	            }

	            else if(j == 9){
	                stairs[i + 1][j - 1] += stairs[i][j];
	                stairs[i + 1][j - 1] %= 1000000000;

	                stairs[i][j] = 0;
	            }

	            else{
	                stairs[i + 1][j + 1] += stairs[i][j];
	                stairs[i + 1][j - 1] += stairs[i][j];

	                stairs[i + 1][j + 1] %= 1000000000;
	                stairs[i + 1][j - 1] %= 1000000000;

	                stairs[i][j] = 0;
	            }
	        }
	    }
	    
	    long sum = 0;
	    for(int i = 0;i < 10;i++){
	        sum += stairs[N][i];
	    }
	    
	    bw.write((sum % 1000000000) + "\n");
	    
	    bw.flush();
	    
	    br.close();
	    bw.close();
	}
}

/*
 * Description:
 * I found the rule that numbers from 1 to 8 except 0 and 9 are separated by two values.
 * First, I initialize the values of stairs[1][1 ~ 9] as one based on N 1.
 * 0 is separated into 1 and 9 is separated into 8 only, the value of j + 1 is raised through the conditional statement,
 * and j - 1 is raise when j is 9.
 * Turn loop as much ad N and add the values in row N to get the answer.
 */
