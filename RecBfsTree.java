// http://www.2cto.com/kf/201311/259183.html

import java.util.ArrayList;

public class RecBfsTree{

    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);

        root.left = n1;
        root.right = n2;

        levelTraversalRec(root);

    }
    public static void levelTraversalRec(TreeNode root) {  
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();  
        dfs(root, 0, ret);  
        System.out.println(ret);  
    }  
       
    private static void dfs(TreeNode root, int level, ArrayList<ArrayList<Integer>> ret){  
        if(root == null){  
            return;  
        }  
           
        // 添加一个新的ArrayList表示新的一层  
        if(level >= ret.size()){  
            ret.add(new ArrayList<Integer>());  
        }  
           
        ret.get(level).add(root.value);   // 把节点添加到表示那一层的ArrayList里  
        dfs(root.left, level+1, ret);       // 递归处理下一层的左子树和右子树  
        dfs(root.right, level+1, ret);  
    }  
}