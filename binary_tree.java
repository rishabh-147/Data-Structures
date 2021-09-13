import java.util.Scanner;

public class binary_tree {

	private TreeNode root;
	private int height = 0;

	public static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int user_input) {
			this.data = user_input;
		}
	}

	public void insertNode(TreeNode newnode) {// TreeNode current_node = root;// local variable ki jarorat ku padi??
		TreeNode current_node = root; // directly ku nahi use krenge root....aur agrr krr rahe h direct to 1st
		// value 50 gayab ho jaa rahi hai

		// REFER TO THIS LINK FOR THE ANSWER ---->
		// https://stackoverflow.com/q/67647008/14937937

		if (current_node == null) {
			root = newnode;
			height += 1;
			return;
		}
		if (height % 2 != 0) {

			while (current_node.left != null) {
				current_node = current_node.left;

			}
			current_node.left = newnode;
			height += 1;
			return;
		}
		while (current_node.right != null) {
			current_node = current_node.right;
		}
		current_node.right = newnode;
		height += 1;
	}

	public void display(TreeNode rootnode, int ch) {
		TreeNode temp = rootnode;
		if (temp == null)
			System.out.println("Tree Empty !!!");
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
		binary_tree bt = new binary_tree();

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
