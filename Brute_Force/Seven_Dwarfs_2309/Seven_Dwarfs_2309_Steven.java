import java.util.*;
import java.io.*;

class Seven_Dwarfs_2309{
	private static List<Integer> res = new ArrayList<>();
	
	public static void brute_force(int[] dwarfs, List<Integer> candidate, int now, int sum){
		/* If now index is out of the range, it should return */
		if(now >= 9) return;

		/* If it detects to what we're looking for, clone the candidate to the result */
		if(candidate.size() == 6 && sum + dwarfs[now] == 100 && res.isEmpty()){
			candidate.add(dwarfs[now]);
			res = new ArrayList<>(candidate);
		}

		/* There are two choices for each dwarf that pick one or not.
		 * Here, first recurisve function supposed to add a dwarf.
		 * Next, second recurisve function supposed to pass a dwarf.
		 */
		else{
			candidate.add(dwarfs[now]);
			brute_force(dwarfs, candidate, now + 1, sum + dwarfs[now]);
			candidate.remove(candidate.size() - 1);
			brute_force(dwarfs, candidate, now + 1, sum);
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] dwarfs = new int[9];

		for(int i = 0 ; i < 9 ; i++){
			dwarfs[i] = Integer.parseInt(br.readLine());
		}

		List<Integer> candidate = new ArrayList<>();

		brute_force(dwarfs, candidate, 0, 0);

		Collections.sort(res);
		for(int dwarf : res){
			bw.write(dwarf + "\n");
		}

		bw.flush();

		br.close();
		bw.close();
	
	}
}
