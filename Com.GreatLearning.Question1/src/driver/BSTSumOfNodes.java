package driver;

import service.BinarySearchTree;

public class BSTSumOfNodes {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);
        tree.insert(70);
        if (!tree.checkSum(tree.root,50)){
            System.out.println("\n Pair not found");
        }

    }
}
