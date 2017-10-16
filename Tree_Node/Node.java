package Tree_Node;

public class Node {
	int key;
	String content;
	Node left, right;
	
	public Node() {
	}
	
	public Node(int x, String a) {
		this.key = x;
		this.content = a;
	}
	
	public Node(int x, String a, Node l, Node r) {
		this.key = x;
		this.content = a;
		this.left = l;
		this.right = r;
	}

	

}
