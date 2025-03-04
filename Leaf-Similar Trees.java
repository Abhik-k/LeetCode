//https://leetcode.com/problems/leaf-similar-trees/
class Solution {
    List<Integer> list = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        findLeafNodes(root1);
        List<Integer> list1 = new ArrayList<>(list);
        list.clear();

        findLeafNodes(root2);
        List<Integer> list2 = new ArrayList<>(list);
        list.clear();
        
        return list1.equals(list2);
    }

    public void findLeafNodes(TreeNode root){
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        findLeafNodes(root.left);
        findLeafNodes(root.right);

        return;
        
    }
}
