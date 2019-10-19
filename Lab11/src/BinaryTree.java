/**
 * 
 * @author Trevor Little
 * @version 4/19/19
 * This is the BinaryTree class where the algorithms are constructed
 */
public class BinaryTree {
	
	public static final BinaryTree EMPTYTREE= new BinaryTree(-1, null, null);
	
	private int key;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	

	public BinaryTree(int key, BinaryTree leftChild, BinaryTree rightChild) {
		this.key= key;
		this.leftChild= leftChild;
		this.rightChild= rightChild;
	}
	
	
	public BinaryTree insert(int data) {
		if(this == EMPTYTREE) {
			return new BinaryTree(data, EMPTYTREE, EMPTYTREE);
		}
		
		
		if(data < this.key) {
			this.leftChild= this.leftChild.insert(data);
			
		}else{
			this.rightChild= this.rightChild.insert(data);
		}
		return this;
	}
	
	public BinaryTree find(int target) {
		if(this== EMPTYTREE) {
			return EMPTYTREE;
		}
		if(this.key== target) {
			return this;
		}
		
		else if(target> this.key) {
			return this.rightChild.find(target);
		}else{
		
			return this.leftChild.find(target);
		}
		
	}
	
	public void printPreOrder() {
		if(this == EMPTYTREE) {
			return;
		}else {
			System.out.println(this.key);
			this.leftChild.printPreOrder();
			this.rightChild.printPreOrder();
		}
		
	}
	
	
	public void printInOrder() {
		if(this== EMPTYTREE) {
			return;
		}else{
			this.leftChild.printInOrder();
			System.out.println(this.key);
			this.rightChild.printInOrder();
			
		}
	}
	
	public void printPostOrder() {
		if(this== EMPTYTREE) {
			return;
		}else{
			this.leftChild.printPostOrder();
			this.rightChild.printPostOrder();
			System.out.println(this.key);
		}
	}
}
