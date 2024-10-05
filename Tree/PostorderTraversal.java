package Tree;

import java.util.Stack;

public class PostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        postOrdre(root);
    }
    static void postOrdre(TreeNode root){

        if(root==null){
            return;
        }

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while(!st1.isEmpty()){
            TreeNode curr = st1.pop();

            st2.push(curr);

            if(curr.left!=null){
                st1.push(curr.left);
            }
            if(curr.right!=null){
                st1.push(curr.right);
            }
        }


        while(!st2.isEmpty()){
            TreeNode node = st2.pop();
            System.out.print(node.val + " ");
        }
    }
}
