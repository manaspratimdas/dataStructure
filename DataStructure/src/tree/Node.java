package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	/***
	 * Three important things while creating a tree node
	 * 1. name of the node
	 * 2. Node should know its parent. Pass parent in constructor
	 * 3. Node should register with the parent as a children. 
	 * 	  parent.getChildern() return a list of node of children of parent.
	 * 	  and when we do parent.getChildern().add(..) that node is registered as child of the parent
	 */
	
	private String id;
	private List<Node> children;
	private Node parent;
	
	
	public Node(Node parent) {
		this.parent = parent;
		this.children=new ArrayList<Node>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


		
	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	

	
	

}
