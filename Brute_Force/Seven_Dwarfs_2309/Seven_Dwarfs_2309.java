import java.util.*;
import java.io.*;


class Seven_Dwarfs_2309{
	private static List<> res;
	public static void brute_force(int[] dwarfs, List<Integer> candidate, int now, int sum){
		if(now > 9) return;

		if(sum == 100 && candidate.size() == 7){
			res = new ArrayList<>(candidate);
		}
		else{
			candidate.add(dwarfs[now]);
			brute_force(dwarfs, candidate, now + 1, sum+dwarfs[now]);
			candidate.remove(res.size()-1);
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

		for(Integer dwarf : res){
			System.out.println(dwarf);
		}

	}
}

