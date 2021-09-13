//Tree which arranges the values according their values

import java.util.Scanner;

public class binary_search_tree {

	private TreeNode root;
	private int height;

	public static class TreeNode {
		public int data;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int user_data) {
			data = user_data;
		}
	}

	public void insertNode(TreeNode new_node) {
		TreeNode current_node = root;
		if (root == null) {
			root = new_node;
			height += 1;
		} else {
			if (new_node.data <= current_node.data) {
				while (current_node.left != null) {
				//	System.out.println("@ "+current_node.data);   -- used to debug....check for the value b4 traverse
					current_node = current_node.left;

				}
			//	System.out.println("# "+current_node.data);    -- used to debug......check for value after traverse
				
				current_node.left = new_node;
				height += 1;
			}
			
			else {
				while (current_node.right != null) {
					current_node = current_node.right;
				}
				current_node.right = new_node;
				height += 1;
		}
		}
		
	}

	public void display(TreeNode rootnode, int ch) {
		TreeNode temp = rootnode;
		if (temp == null) {
			System.out.println("Tree is Empty !!!");

		}
		else {
			while (temp != null) {
						System.out.println(temp.data + " $");
						if (ch == '1')
							temp = temp.left;
						else if (ch == '2')
							temp = temp.right;

					}
}
			
		

		System.out.println("Height of the tree = " + height);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binary_search_tree bt = new binary_search_tree();

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the tree: ");
		int h = in.nextInt();
		System.out.println("Enter the elements: ");
		for (int i = 0; i <= h; i++) {
			int val = in.nextInt();
			TreeNode newNode = new TreeNode(val);
			bt.insertNode(newNode);
		}
		char ch = '\u0000';
		System.out.println("press 1 for LEFT SUBTREE \npress 2 for RIGHT SUBTREE.\npress Q to exit.");

		while (ch != 'q') {
			ch = in.next().charAt(0);
			if (ch == '1' || ch == '2') {
				int choice = (int) ch;
				bt.display(bt.root, choice);
			}
		}
		System.out.println("Thank You !!!");

	}

}
