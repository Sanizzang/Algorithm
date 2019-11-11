import java.util.*;
import java.io.*;

class Node{
	private int parent, left, right;
	
	Node(){ this.parent = -1; }

	public int getParent() { return this.parent; }
	public int getLeft() { return this.left; }
	public int getRight() { return this.right; }

	public void setParent(int parent) { this.parent = parent; }
	public void setLeft(int left) { this.left = left; }
	public void setRight(int right) { this.right = right; }
}
 
class HeightAndWidthOfTree_2250{
	private static int N, x;
	private static int[] min, max;

	public static void inOrderTraversal(int now, int level, List<Node> tree){
		int left = tree.get(now).getLeft();
		if(left != -1)
			inOrderTraversal(left, level + 1, tree);
		
		min[level] = Math.min(min[level], x);
		/* A value into the max should be updated as last X*/
		max[level] = x;
		x++;
		
		int right = tree.get(now).getRight();
		if(right != -1)
			inOrderTraversal(right, level + 1, tree);

	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		List<Node> tree = new ArrayList<>();

		min = new int[N+1];
		max = new int[N+1];

		for(int i = 0 ; i <= N ; i++){
			tree.add(new Node());
			min[i] = N;
			max[i] = 0;
		}
		/* Each index of tree supposed to be a current node. */
		/* Each node has left and right value. */
		for(int i = 1 ; i <= N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int now = Integer.parseInt(st.nextToken());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			tree.get(now).setLeft(left);
			tree.get(now).setRight(right);
			if(left != -1) tree.get(left).setParent(now);
			if(right != -1) tree.get(right).setParent(now);
		}
		
		/* If a node doesn't have a parent node, the node should be root. */
		int root = -1;
		for(int i = 1 ; i <= N ; i++){
			if(tree.get(i).getParent() == -1)
				root = i;
		}

		inOrderTraversal(root, 1, tree);

		/* Find the maximum width and its level. */
		int resLevel = -1;
		int resWidth = -1;
		for(int i = 1 ; i <= N ; i++){
			int candidate = max[i] - min[i] + 1;
			if(candidate > resWidth){
				resWidth = candidate;
				resLevel = i;
			}
		}

		bw.write(resLevel + " " + resWidth + "\n");

		bw.flush();

		br.close();
		bw.close();
	}
}





