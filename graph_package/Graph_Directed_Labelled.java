package graph_package;

import java.util.HashMap;
//import java.util.Map.Entry;

public class Graph_Directed_Labelled {
	private HashMap<Node_Graph, HashMap<Node_Graph, String>> mygraph = new HashMap<>();

	public void add_Node(Node_Graph a) {
		if (!mygraph.containsKey(a)) {
			this.mygraph.put(a, null);
		}
	}

	public void add_Neighbour(Node_Graph p, Node_Graph n, String weight) {
		if (!mygraph.containsKey(p)) {
			add_Node(p);
		}
		if (!(mygraph.get(p)).containsKey(n)) {
			this.mygraph.get(p).put(n, weight);
		}
		if (!mygraph.containsKey(n)) {
			add_Node(n);
		}
		
	}

	public void add_Neighbour_List(Node_Graph p, HashMap<Node_Graph, String> list) {
		if (!mygraph.containsKey(p)) {
			add_Node(p);
		}
		this.mygraph.get(p).putAll(list);
		
		/*for (Entry<Node_Graph, String> entry : list.entrySet()) {
			if(!mygraph.containsKey(entry.getKey()))
	        add_Node(entry.getKey());
	    }*/
		for (Node_Graph a : list.keySet()) {
			if(!mygraph.containsKey(a)) {
		        add_Node(a);
			}
		}
	}

	public HashMap<Node_Graph, String> get_Neighbours(Node_Graph n) {
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
