
class Node{
	private int parent, now, left, right;
	Node(int now, int left, int right){
		this.parent = -1;
		this.now = now;
		this.left = left;
		this.right = right;
	}

	public int getParent() { return this.parent; }
	public int getNow() { return this.now; }
	public int getLeft() { return this.left; }
	public int getRight() { return this.right; }

	public void setParent(int parent) { this.parent = parent; }
	public void setLeft(int left) { this.left = left; }
	public void setRight(int right) { this.right = right; }
}
 
class HeightAndWidthOfTree_2250{
	private static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		List<Node> tree = new ArrayList<>();

		int[] min = new int[N+1];
		int[] max = new int[N+1];

		for(int i = 1 ; i <= N ; i++){
			tree.add(new Node(i, -1. -1);
			min[i] = N;
			max[i] = 0;
		}


