import java.util.*;
import java.io.*;

class Steven{
   private static int[] nums = new int[]{2, 1, 2, 3, 4, 5, 4, 3};
   
   public static void main(String args[]) throws Exception{ 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
       int N = Integer.parseInt(br.readLine());
       
       bw.write(nums[N % 8] + "\n");
       
       bw.flush();
       
       br.close();
       bw.close();
   }
 }

