import java.util.*;
import java.io.*;

class TrieNode{
	char nodeChar;
	boolean isLastChar;
	LinkedList<TrieNode> childList;

	TrieNode(char c){
		nodeChar = c;
		isLastChar = false;
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

	Trie() { root = new TrieNode('\u0000'); }

	public TrieNode getRoot() { return this.root; }
	public void insert(String s){
		TrieNode current = root;

		for(char c : s.toCharArray()){
			TrieNode child = current.subNode(c);
			if(child != null){
				current = child;
			}
			else{
				current.childList.add(new TrieNode(c));
				current = current.subNode(c);
			}
		}
			
		current.isLastChar = true;
	}

	public boolean search(TrieNode parent){
		if(parent.isLastChar && parent.childList.size() > 0)
			return true;

		for(TrieNode eachChild : parent.childList){		
			if(search(eachChild))
				return true;
		}

		return false;
	}

}

class Steven{
	private static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		while(T-- > 0){
			N = Integer.parseInt(br.readLine());
			Trie trie = new Trie();

			for(int i = 0 ; i < N ; i++){
				trie.insert(br.readLine());
			}
			
			bw.write((trie.search(trie.getRoot()) ? "NO" : "YES") + "\n");

		}
			
		bw.flush();

		br.close();
		bw.close();
	}
}



