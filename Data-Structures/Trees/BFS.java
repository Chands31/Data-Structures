public class BFS{
    List<Integer> list = new ArrayList<>();
    public List<Integer> bfs(TreeNode root){
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0;i<n;i++){
                TreeNode curr = queue.remove();
                list.add(root.val);

                if(curr.left != null) queue.offer(curr.left.val);
                if(curr.right != null) queue.offer(curr.right.val);
            }
        }

        return list;
    }
}