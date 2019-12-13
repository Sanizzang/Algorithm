import java.util.*;
import java.io.*;

class SugarDelivery_2839_Steven{
        private static int[] S = new int[5001];
        private static boolean[] valid = new boolean[5001];
        private static int N;

        public static void setRequirementOfBagForSugar(){
                /* Marking the numbers on 3*i + 5*j */
		for(int i = 0 ; i < 5001 ; i++){
                        for(int j = 0 ; (3*i + 5*j) < 5001 ; j++){
                                valid[(3*i + 5*j)] = true;
                        }
                }

                for(int j = 0 ; j < 5001 ; j++){
                        for(int i = 0 ; (3*i + 5*j) < 5001 ; i++){
                                valid[(3*i + 5*j)] = true;
                        }
                }

                S[3] = S[5] = 1;
		
                for(int i = 6 ; i < 5001 ; i++){
                        /* If the number is not on 3*i + 5*j, continue */
			if(!valid[i]) continue;

                        int candi1 = 9999999, candi2 = 9999999;
			
                        if(valid[i-3]) candi1 = S[i-3];
                        if(valid[i-5]) candi2 = S[i-5];

                        S[i] = Math.min(candi1, candi2) + 1;
                }
        }
        public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                setRequirementOfBagForSugar();
                N = Integer.parseInt(br.readLine());

                bw.write((valid[N] ? S[N] : -1) + "\n");

                bw.flush();

                br.close();
                bw.close();
        }
}

