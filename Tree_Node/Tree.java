package Tree_Node;

public class Tree {
	Node root = new Node();
	
	public Tree(int k, String cont) {
		this.root.key = k;
		this.root.content = cont;
	}
	
	public Tree(Node r) {
		this.root = r;
	}
	
	public void put_load(int k, String cont) {
		Node x = root;
		
		while(x.key != k) {
			if(k < x.key) {
				if(x.left != null) {
				x = x.left;
				} else {
					Node node = new Node(k, cont);
					x.left = node;
					return;
				}
			} else {
				if(x.right != null) {
					x = x.right;
					} else {
						Node node = new Node(k, cont);
						x.right = node;
						return;
					}
			}
		}
		x.content = cont;
	}
	
	public String get(int k) {
		Node x = root;
		
		while(x.key != k) {
			if(k < x.key) {
				if(x.left != null) {
					x = x.left;
				} else {
					System.out.println("Error! Node not found!");
					return null;
				}
			} else {
				if(x.right != null) {
					x = x.right;
				} else {
					System.out.println("Error! Node not found!");
					return null;
				}
			}
		}
		return x.content;
	}
	
	public void delete(int k) {
		Node x = root;
		Node y = null;
		int flag = 0;
		
		while(x.key != k) {
			if(k < x.key) {
				if(x.left != null) {
					y = x;
					x = x.left;
					if(x.left == null && x.right == null) {
						flag = 11;
					}
					if(x.left == null && x.right != null) {
						flag = 12;
					}
					if(x.left != null && x.right == null) {
						flag = 13;
					}
					if(x.left != null && x.right != null) {
						flag = 14;
					}
				} else {
					System.out.println("Error! Node not found!");
					return;
				}
			} else {
				if(x.right != null) {
					y = x;
					x = x.right;
					if(x.left == null && x.right == null) {
						flag = 21;
					}
					if(x.left == null && x.right != null) {
						flag = 22;
					}
					if(x.left != null && x.right == null) {
						flag = 23;
					}
					if(x.left != null && x.right != null) {
						flag = 24;
					}
				} else {
					System.out.println("Error! Node not found!");
					return;
				}
			}
		}
		if(flag == 11) {
			y.left = null;
		}
		if(flag == 12) {
			y.left = x.right;
		}
		if(flag == 13) {
			y.left = y.left;
		}
		if(flag == 14) {
			Node t = x.right;
			while(t.left != null) {
				t = t.left;
			}
			t.left = x.left;
			t.right = x.right;
			y.left = t;
		}
		if(flag == 21) {
			y.right = null;
		}
		if(flag == 22) {
			y.right = x.right;
		}
		if(flag == 23) {
			y.right = x.left;
		}
		if(flag == 24) {
			Node t = x.right;
			while(t.left != null) {
				t = t.left;
			}
			t.left = x.left;
			t.right = x.right;
			y.right = t;
		}
	}
	
	public static void main(String[] args) {
		Tree t = new Tree(10, "First node");
		t.put_load(4, "Node 4");
		t.put_load(18, "Node 18");
		t.put_load(7, "Node 7");
		t.put_load(9, "Node 9");
		t.put_load(6, "Node 6");
		t.put_load(11, "Node 11");
		System.out.println(t.get(11));
		t.delete(18);
		System.out.println(t.get(18));
		System.out.println(t.get(7));
		t.put_load(7, "New node 7");
		System.out.println(t.get(7));
		t.delete(7);
		System.out.println(t.get(7));
		System.out.println(t.get(9));
		t.put_load(8, "Node 8");
		System.out.println(t.get(8));
	}

}
