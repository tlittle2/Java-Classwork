/**
 * 
 * @author Trevor Little
 * @version 4/19/19
 * This is the BinaryTree Driver class that tests the methods of BinaryTree.java
 */
public class Lab12_Main {

	public Lab12_Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			BinaryTree testTree = new BinaryTree (25 ,
													new BinaryTree ( 12,
														new BinaryTree ( 9 , BinaryTree .EMPTYTREE, BinaryTree .EMPTYTREE),
														new BinaryTree ( 14, BinaryTree .EMPTYTREE, BinaryTree .EMPTYTREE) ) ,
													new BinaryTree ( 36 ,
														new BinaryTree ( 29 , BinaryTree .EMPTYTREE,
																				BinaryTree .EMPTYTREE) ,
																BinaryTree .EMPTYTREE) ) ;
			
			testTree.find(12).printPostOrder();
			System.out.println( "testTree inorder : ") ;
			testTree.printInOrder();
			BinaryTree newTree = testTree.insert(11);
			System.out.println("newTree inorder: ");
			newTree.printInOrder();
			System.out.println("testTree inorder: ");
			testTree.printInOrder();
			BinaryTree tree03 =
			BinaryTree .EMPTYTREE
			.insert(34)
			.insert(48)
			.insert(29)
			.insert(36)
			.insert(12)
			.insert(9);
			System.out.println( "tree03 preorder : ");
			tree03.printPreOrder();
			System.out.println("tree03 inorder: ");
			tree03.printInOrder();
			System.out.println("tree03 postorder: ");
			tree03.printPostOrder();

	}

}

