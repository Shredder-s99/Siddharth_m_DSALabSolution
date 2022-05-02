package service;

public class BinarySearchTree {

    public class Node {
        public int key;
        public Node left, right;

        public Node(int item)
        {
             key = item;
             left = right = null;
        }
    }

    public Node root;
    public BinarySearchTree() { root = null; }

    public BinarySearchTree(int value) { root = new Node(value); }

    public void insert(int key) { root = insertRec(root, key); }
    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key <= root.key){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key){
        root.right = insertRec(root.right, key);
        }
        return root;
    }

    public boolean checkSum(Node root,int sum){
        boolean flag = false;
        if(root!=null){
            System.out.print("Values "+root.key);
        }
        if(root.left!=null){
            System.out.print("Values "+root.left.key);
        }
        if (root.right!=null){
            System.out.println("Values "+root.right.key);
        }
        //+" "+root.left.key+" "+ root.right.key);
        while(root != null && flag == false){
            if((root.left!=null) && (root.key +root.left.key) == sum){
                flag = true;
                System.out.println("Pair is ("+root.key+","+root.left.key+')' );
                return flag;
            }
            else if((root.right!=null) && (root.key + root.right.key) == sum){
                flag = true;
                System.out.println("Pair is ("+root.key+","+root.right.key+')' );
                return flag;
            }
            else if((root.right!=null && root.left!=null) &&(root.left.key + root.right.key == sum)){
                flag = true;
                System.out.println("Pair is ("+root.left.key+","+root.right.key+')' );
                return flag;
            }
            else if(!flag && root.right!=null){
                flag=checkSum(root.right,sum);
            }
            else if(!flag && root.left!=null){
                flag = checkSum(root.left,sum);
            }

            return flag;
        }

        return flag;
    }

}
