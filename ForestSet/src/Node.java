import java.util.ArrayList;

public class Node {
	Integer member;
	Node p;
	int rank;
	
	ArrayList<Node>children;
	
	public Node(Integer member) {
		this.member = member;
		children= new ArrayList<Node>();
	}

	public Integer getMember() {
		return member;
	}

	public void setMember(Integer member) {
		this.member = member;
	}

	public Node getP() {
		return p;
	}

	public void setP(Node p) {
		this.p = p;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public ArrayList<Node> getChildren(){
		return children;
	}
	
	
	public void addChild(Node z){
		children.add(z);
	}
	
	
}
