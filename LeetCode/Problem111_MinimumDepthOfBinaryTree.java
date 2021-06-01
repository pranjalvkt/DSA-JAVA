/*
*   @author
*   Pranjal Tripathi
*   Problem 111
*/

package LeetCode;
import java.util.*;

public class Problem111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        int minimumDepth = 0;
        if(root == null) return minimumDepth;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            minimumDepth++;
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if(current.left == null && current.right == null) {
                    return minimumDepth;
                }
                
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return minimumDepth;
    }
}
