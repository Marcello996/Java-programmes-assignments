package graph_package;


public class Node_Graph {
	private int ID_node;
	private String info_node;
	
	void set_node (int x, String aaa) {
		this.setID_node(x);
		this.setInfo_node(aaa);
	}

	public int getID_node() {
		return ID_node;
	}

	public void setID_node(int iD_node) {
		ID_node = iD_node;
	}

	public String getInfo_node() {
		return info_node;
	}

	public void setInfo_node(String info_node) {
		this.info_node = info_node;
	}
	
	
}
