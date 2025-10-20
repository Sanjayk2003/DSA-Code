class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data=data;
    }
}
class BinaryTree
{
    TreeNode root;
    void insert(){
    TreeNode n1=new TreeNode(9);
    TreeNode n2=new TreeNode(5);
    TreeNode n3=new TreeNode(7);
    TreeNode n4=new TreeNode(0);
     root=n1;
     n1.left=n2;
     n2.left=n4;
     n4.left=n3;
    }
    void parsing(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        parsing(root.left);
        parsing(root.right);

    }

     

}
public class TreeBinary {
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.insert();
        b.parsing(b.root);
        
    }
    
}
