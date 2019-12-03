
public class Forest {
	Node root;

	/*
	 * This implementation has a dummy method node
	 */
	public Forest() {
		root= new Node(null);
		
	}
	
	//Make a new set where x is the only thing in that set
	public void makeSet(Integer x){
		Node n= new Node(x);
		n.setP(root);
		n.setRank(0);
		root.addChild(n);
	}
	
	//given some integer and a node, if the value in the child node is what we want, return true 
	private boolean findSet(Integer x, Node n) {
		if(n.getChildren().isEmpty()){
			
		}else {
			for(Node c: n.getChildren()) {
				if(c.getMember() == x) {
					return true;
				}
			}
		}
		return false;
		
	}
	/*
	 * Find representative node for some integer (first value in the set)
	 * If the representative node is the dummy node, return the value of the dummy node (null)
	 * Go through each child of the dummy node. If that child == the value in the parameter, return that value
	 * else recurse through its other children via findSet boolean helper method until we find the value
	 *
	 */
	public Node findSet(Integer x) {
		for(int i = 0; i < root.getChildren().size(); i++) {
			if(root.getChildren().get(i).getMember() == x) {
				return root.getChildren().get(i);
			}else {
				if(findSet(x,root.getChildren().get(i))) {
					return root.getChildren().get(i);
				}
			}
			
		}
		return root;
		
		
	}
	/*
	 * Merge 2 nodes into one tree
	 * UNION SHORTERLIST ONTO LONGERLIST
	 * add the child, set the pointer, and remove everything from the shorterlist to keep sets disjoint (different)
	 * reset the ranks wherever necessary
	 */
	private void link(Node x, Node y) {
		if(x.getRank() >= y.getRank()) {
			x.addChild(y);
			y.setP(x);
			root.getChildren().remove(y);
		}else {
			y.addChild(x);
			x.setP(y);
			root.getChildren().remove(x);
		}
		
		if(x.getRank() == y.getRank()){
			y.setRank(y.getRank() + 1); 
		}
		
	}
	
	public void union(Integer x, Integer y) {
		this.link(findSet(x), findSet(y));
	}
	
	//toString helper method that helps us reach further levels of children
	private String stringHelper(Node x) {
		String s= ","+x.getMember();
		if(x.getChildren().size() != 0) {
			for(Node e: x.getChildren()) {
				s+= stringHelper(e);
			}
			
		}
		return s;
		
	}

	/*
	 * Print out each node and its children
	 * Needs helper method because we don't know how long the chain could be, and we can only access first level of children in regular method 
	 * 
	 */
	@Override
	public String toString() {
		String s = "Forest";
		for(Node i: root.getChildren()) {
			s+=" [" +i.getMember();
			if(i.getChildren().size() != 0) {
				for(Node e: i.getChildren())
				s+=stringHelper(e);
			}
			s+= "]";
		}
		
		return s;
		
	}
	
	

}
