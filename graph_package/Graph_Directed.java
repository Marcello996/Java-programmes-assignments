package graph_package;

import java.util.HashMap;
import java.util.List;

public class Graph_Directed {
	private HashMap<Node_Graph, List<Node_Graph>> mygraph = new HashMap<>();

	public void add_Node(Node_Graph a) {
		if (!mygraph.containsKey(a)) {
			this.mygraph.put(a, null);
		}
	}

	public void add_Neighbour(Node_Graph p, Node_Graph n) {
		if (!mygraph.containsKey(p)) {
			add_Node(p);
		}
		if (!(mygraph.get(p)).contains(n)) {
			this.mygraph.get(p).add(n);
		}
		if (!mygraph.containsKey(n)) {
			add_Node(n);
		}
		
	}

	public void add_Neighbour_List(Node_Graph p, List<Node_Graph> list) {
		if (!mygraph.containsKey(p)) {
			add_Node(p);
		}

		for (int i = 0; i < list.size(); i++) {
			if (!(mygraph.get(p)).contains(list.get(i))) {
				this.mygraph.get(p).add(list.get(i));
			}
			if (!mygraph.containsKey(list.get(i))) {
				add_Node(list.get(i));
			}
		}
	}

	public List<Node_Graph> get_Neighbours(Node_Graph n) {
		if (mygraph.containsKey(n)) {
			return mygraph.get(n);
		}
		return null;
	}

	public void delete_Neighbour(Node_Graph p, Node_Graph n) {
		if (mygraph.containsKey(p)) {
			this.mygraph.get(p).remove(n);
		}
	}

}
