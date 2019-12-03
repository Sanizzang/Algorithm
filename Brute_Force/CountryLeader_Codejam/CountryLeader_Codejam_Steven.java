import java.util.*;
import java.io.*;

class Candidate{
	private String name;
	private int diffLetter;
	private boolean[] alphabets = new boolean[26];

	Candidate(String name){
		this.name = name;
		getDiffLetter(this.name.toCharArray());
	}

	private void getDiffLetter(char[] letters){
		int cnt = 0;
		
		/* count different alphabet letters from the name */
		for(char letter : letters){
			if(letter == ' ') continue;
			if(!alphabets[letter - 'A']) cnt++;
			this.alphabets[letter - 'A'] = true;
		}

		this.diffLetter = cnt;
	}

	public String getName() { return this.name; }
	public int getDiffLetter() { return this.diffLetter; }

}

class CountryLeader_Codejam{
	private static int N; 
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for(int i = 1 ; i <= t ; i++){
			N = in.nextInt();
			Candidate[] candidates = new Candidate[N];

			in.nextLine();
			for(int j = 0 ; j < N ; j++){
				candidates[j] = new Candidate(in.nextLine());
			}
			
			/* Sort candidates in the special order */
			Arrays.sort(candidates, new Comparator<Candidate>(){
				@Override
				public int compare(Candidate p1, Candidate p2){
					/* If differet letters of p1, p2 are same, it should be compared by name */
					if(p1.getDiffLetter() == p2.getDiffLetter())
						/* this is increasing order */
						return p1.getName().compareTo(p2.getName());
					else
						/* this is decreasing order */
						return p2.getDiffLetter() - p1.getDiffLetter();
				}
			});

			
			System.out.println("Case #" + i + ": " + candidates[0].getName());
		}

		in.close();
	}
}
