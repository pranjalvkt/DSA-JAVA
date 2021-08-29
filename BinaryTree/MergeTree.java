package BinaryTree;

public class MergeTree {

    public BinaryTreeNode solve(BinaryTreeNode A, BinaryTreeNode B) {
        if (A == null)
            return B;
        if (B == null)
            return A;
        A.data += B.data;

        A.left = solve(A.left, B.left);
        A.right = solve(A.right, B.right);
        return A;
    }

}
