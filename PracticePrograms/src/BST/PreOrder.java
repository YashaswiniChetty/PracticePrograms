package BST;

public class PreOrder {
    public static void main(String [] args){
        BST1 b = new BST1();
        Node root = b.createNewNode( 2);
        root.left = b.createNewNode( 7);
        root.right = b.createNewNode( 5);
        root.left.left = b.createNewNode( 2);
        root.left.right = b.createNewNode( 6);
        root.left.right.left = b.createNewNode( 5);
        root.left.right.right = b.createNewNode( 11);
        root.right.right = b.createNewNode( 9);
        root.right.right.left = b.createNewNode( 4);
        System.out.print("PreOrder :");// root left and right
        b.preOrder(root);

    }
}
