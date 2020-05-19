import java.util.*;
import java.io.*;

class TrieNode{
	int cnt;
	char nodeChar;
	LinkedList<TrieNode> childList;

	TrieNode(char c){
		cnt = 0;
		nodeChar = c;
		childList = new LinkedList<TrieNode>();
	}

	public TrieNode subNode(char c){
		for(TrieNode eachChild : childList){
			if(eachChild.nodeChar == c)
				return eachChild;
		}

		return null;
	}

}

class Trie{
	private TrieNode root;

	Trie(){ root = new TrieNode('\u0000'); }

	public TrieNode getRoot() { return this.root; }
	public void insert(String word){
		TrieNode current = root;
		for(char ch : word.toCharArray()){
			TrieNode child = current.subNode(ch);
			if(child != null) current = child;
			else{
				current.childList.add(new TrieNode(ch));
				current = current.subNode(ch);
			}
		}

		current.cnt++;
	}

}

class Steven{
	private static int N, K, res;
	public static int solve(TrieNode parent, int depth){
		int cnt = parent.cnt;

		for(TrieNode eachNode : parent.childList){
			cnt+=solve(eachNode, depth + 1);
		}
		
		res+=depth * (cnt / K);

		return cnt % K;
	}

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = in.nextInt();

		for(int t = 1 ; t <= T ; t++){
			N = in.nextInt();
			K = in.nextInt();

			in.nextLine();

			res = 0;
			Trie trie = new Trie();
			for(int i = 0 ; i < N ; i++){
				trie.insert(in.nextLine());
			}
			
			solve(trie.getRoot(), 0);
			
			bw.write("Case #" + t + ": " + res + "\n");

		}

		bw.flush();

		in.close();
		bw.close();
	}
}
