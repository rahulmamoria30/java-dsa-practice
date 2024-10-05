package Tree;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val=val;
        left = right = null;
    }
}
public class InorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        List<Integer> ans= new ArrayList<>();
//        inorder(root, ans);
        inorderIterative(root);
//        System.out.println(ans);

    }

//    static void inorder(TreeNode root, List<Integer>list){
//        if(root!=null){
//            inorder(root.left, list);
//            list.add(root.val);
//            inorder(root.right, list);
//        }
//    }
    static void inorderIterative(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !st.empty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr = st.pop();
            System.out.print(curr.val + " ");
            curr=curr.right;
        }
    }
}
