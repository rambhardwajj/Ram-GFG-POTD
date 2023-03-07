Max Level Sum in Binary Tree

class Solution {
    public int maxLevelSum(Node root) {
        if( root == null) return 0;
        int max = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add( root);
        while( !q.isEmpty())
        {
            int lvl= q.size(); int sum =0;
            for( int i =0 ; i< lvl ; i++)
            {
                Node curr= q.poll();
                if( curr.left!=null) q.add( curr.left);
                if( curr.right!=null) q.add( curr.right);
                sum+=curr.data;
            }
            if( sum>max)
                max=sum;
        }
        return max;
    }
}