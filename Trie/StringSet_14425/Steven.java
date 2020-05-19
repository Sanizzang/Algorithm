import java.util.*;
import java.io.*;

class TrieNode{
	char nodeChar;
	boolean isLastChar;
	LinkedList<TrieNode> childList;

	TrieNode(){
		nodeChar = '\u0000';
		isLastChar = false;
		childList = new LinkedList<TrieNode>();
	}

	TrieNode(char c){
		nodeChar = c;
		isLastChar = false;
		childList = new LinkedList<TrieNode>();
	}

	public TrieNode subNode(char nextChar){
		for(TrieNode eachChild : childList){
			if(eachChild.nodeChar == nextChar)
				return eachChild;
		}

		return null;
	}

}

class Trie{
	private TrieNode root;

	public Trie(){
		root = new TrieNode();
	}

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

		current.isLastChar = true;
	}

	public boolean search(String word){
		TrieNode current = root;

		for(char ch : word.toCharArray()){
			TrieNode child = current.subNode(ch);
			if(child == null) return false;
			else current = child;
		}

		return current.isLastChar;
	}
}

public class Steven{
	private static int N, M;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		Trie trie = new Trie();
		while(N-- > 0){
			trie.insert(br.readLine());
		}

		int cnt = 0;
		while(M-- > 0){
			if(trie.search(br.readLine()))
				cnt++;
		}

		bw.write(cnt + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}
