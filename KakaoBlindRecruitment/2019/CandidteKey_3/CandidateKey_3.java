import java.util.*;
import java.io.*;
	
class CandidateKey_3{
	public static boolean isCandidateKey(String[][] map, int candidate){
		HashSet set = new HashSet();
		for(int i = 0 ; i < map.length ; i++){
			String tuple = "";

			for(int j = 0 ; j < map[0].length ; j++){
				if((candidate & (1 << j)) > 0)
					tuple+=map[i][j];
			}

			set.add(tuple);
		}
		
		return map.length == set.size();
	}
	
	public static void getCandidates(String[][] map, List<Integer> key, int pastCandidate, int now){
		if(now == map[0].length) return;

		int candidate = pastCandidate | 1 << now;

		if(isCandidateKey(map, candidate)) 
			key.add(candidate);

		getCandidates(map, key, candidate, now + 1);
		getCandidates(map, key, pastCandidate, now + 1);
	}
	
	public static void main(String[] args) throws Exception{
		String[][] map = new String[][] { {"100", "ryan", "music", "2"},
						  {"200", "apeach", "math", "2"},
						  {"300", "tube", "computer", "3"},
						  {"400", "con", "computer", "4"},
						  {"500", "muzi", "music", "3"},
						  {"600", "apeach", "music", "2"}
						};
		
		List<Integer> key = new ArrayList<>();
		getCandidates(map, key, 0, 0);

		Collections.sort(key);

		boolean[] duplicated = new boolean[key.size()];
		int cnt = 0 ;

		for(int i = 0 ; i < key.size() ; i++){
			if(duplicated[i]) continue;
			
			cnt++;
			for(int j = i + 1 ; j < key.size() ; j++){
				if((key.get(i) & key.get(j)) == key.get(i))
					duplicated[j] = true;
			}
		}

		System.out.println(cnt);
	}
}


