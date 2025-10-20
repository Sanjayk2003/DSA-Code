/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.LinkedList;
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
class BinaryTree{
    TreeNode root;
    void insert(int data) 
    {
        root=InsertNode(root,data);
    }
    TreeNode InsertNode(TreeNode root,int data)
    {
        if(root==null)
        {
            return new TreeNode(data);
        }
        else{
            if(root.data>=data)
            {
             root.left=InsertNode(root.left,data);  
            }
            else
            {
              root.right=  InsertNode(root.right,data);
            }
        }
        return root;
    }
    void preOrder()
    {
        if(root==null)
        {
            return ;
        }
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode d=s.pop();
            System.out.println(d.data);
            if(d.right!=null)
            s.push(d.right);
            if(d.left!=null)
            s.push(d.left);
            
        }
    }
    void preOrder1(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        else{
            System.out.println(root.data);
            preOrder1(root.left);
            preOrder1(root.right);
            
        }
    }
    void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        else{
        inOrder( root.left);
        System.out.println(root.data);
        inOrder(root.right);
        }
    }
    void inOrder1()
    {
        if(root==null)
        {
            return;
        }

        Stack<TreeNode> s=new Stack<>();
        TreeNode temp=root;
        while(!s.isEmpty()||temp!=null)
        {
            if(temp!=null)
            {
                s.push(temp);
                temp=temp.left;
            }
            else{
                temp=s.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }
    }
    void postOrder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    void postOrder1()
    {
        Stack<TreeNode> s=new Stack<>();
        TreeNode current=root;
        while(!s.isEmpty()||current!=null)
        {
            if(current!=null)
            {
                s.push(current);
                current=current.left;
            }
            else{
                TreeNode temp=s.peek().right;
                if(temp==null)
                {
                  temp=s.pop();
                  System.out.println(temp.data);
                  while(!s.isEmpty()&&temp==s.peek().right)
                  {
                    temp=s.pop();
                    System.out.println(temp.data);
                  }
                }
                else
                current=temp;
            }
        }
    }
    TreeNode levelOrder1()
    {
        int max=root.data;
        if(root==null)
        {
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            System.out.print(temp.data+" ");
            if(max<temp.data)
            max=temp.data;

            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
        }
        System.out.println(max);
        return root;
    }
    int max()
    {
        return max(root);
    }
    int max(TreeNode root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int result=root.data;
        int left=max(root.left);
        int right=max(root.right);
        if(left>right)
        result=left;
        else if(left<right)
        result=right;

        return result;

    }
    TreeNode search(TreeNode root,int key)
    {
        if(root==null||root.data==key)
        {
            return root;
        }
        if(key<root.data)
        return search(root.left,key);
        else
        return search(root.right,key);
    }
    boolean isValid()
    {
        long max=Long.MAX_VALUE;
        long min=Long.MIN_VALUE;
        boolean result=checkk(root,min,max);
        return result;
    }
    boolean checkk(TreeNode temp,long min,long max)
    {
        if(temp==null)
        return true;
        if(temp.data>=max||temp.data<=min)
        {
            return false;
        }
        boolean left=checkk(temp.left,min,temp.data);
        if(left)
        {
            boolean right=checkk(temp.right,temp.data,max);
            return right;
        }
        return false;
    }
}
public class BinarTree
{
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
        b.insert(1);
        b.insert(0);
        b.insert(2);
        b.preOrder();
































		//  b.insert(7);
		// b.insert(5);
		// b.insert(6);
		// b.insert(4);
        // b.insert(9);
 		// b.insert(8);
 		// b.insert(11);
		// b.preOrder();
        // b.preOrder();
        // b.preOrder1(b.root);
        // b.postOrder(b.root);
        // b.postOrder1();
		
        // System.out.println(b.levelOrder1().data);
        // System.out.println(b.max());
        // System.out.println(b.search(b.root,0));
        // System.out.println(b.isValid());
        // System.out.println(Math.random());
	}
}








