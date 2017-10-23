package trees;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

/**
 * This Code shows how to traverse through trees.
 * @author Arnoldo
 *
 */
public class BTree_Traversals {

	BTree tree;
	@Before
	public void setup(){
		TNode A = new TNode('A');
		TNode B = new TNode('B');
		TNode C = new TNode('C');
		TNode D = new TNode('D');
		TNode E = new TNode('E');
		TNode F = new TNode('F');
		TNode G = new TNode('G');
		TNode H = new TNode('H');
		TNode I = new TNode('I');
		TNode J = new TNode('J');
		TNode K = new TNode('K');
		G.left = I;
		D.left = G;
		B.right = D;
		A.left = B;
		H.left = J;
		H.right = K;
		E.right = H;
		C.left = E;
		C.right = F;
		A.right = C;

		tree = new BTree(A);
	}
	
	@Test
	public void pre_order_traversal_test() {
		System.out.println("\n\n---------------------------\nThis is Pre-Order Traversal \n---------------------------");
		preOrderTraversal(tree.root);
	}
	
	@Test
	public void in_order_traversal_test() {
		System.out.println("\n\n---------------------------\nThis is In-Order Traversal \n---------------------------");
		inOrderTraversal(tree.root);
	}
	
	@Test
	public void post_order_traversal_test() {
		System.out.println("\n\n---------------------------\nThis is Post-Order Traversal \n---------------------------");
		postOrderTraversal(tree.root);
	}
	
	@Test
	public void level_order_traversal_test() {
		System.out.println("\n\n---------------------------\nThis is Level-Order Traversal \n---------------------------");
		levelOrderTraversal(tree.root);
	}

	public void preOrderTraversal(TNode root){
		if(root != null){
			System.out.print(root.data + " - ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void inOrderTraversal(TNode root){
		if(root != null){
			preOrderTraversal(root.left);
			System.out.print(root.data + " - ");
			preOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(TNode root){
		if(root != null){
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			System.out.print(root.data + " - ");
		}
	}
	
	private void levelOrderTraversal(TNode root) {

		Queue<TNode> nodeQ = new LinkedList<TNode>();
		TNode temp;
		
		//Enqueue first item to Queue
		nodeQ.add(root);
		
		while(!nodeQ.isEmpty()){
			//dequeue
			temp = nodeQ.poll();
			
			//Add children to Queue if possible
			if(temp.left != null)
				nodeQ.add(temp.left);
			if(temp.right != null)
				nodeQ.add(temp.right);
			
			//Print data
			System.out.print(temp.data + " - ");
		}
	}

}
