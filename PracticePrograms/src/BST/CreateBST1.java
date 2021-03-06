package BST;

    class BST1{
        public Node createNewNode(int data){
            Node a = new Node();
            a.data = data;
            a.left = null;
            a.right = null;
            return a;
        }

        public void inOrder(Node node){
            if(node == null){
                return;
            }
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }

        public void preOrder(Node node){
            if(node == null){
                return;
            }
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        public void postOrder(Node node){
            if(node == null){
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }

        public int sumOfAllNodes(Node node){
            if(node == null){
                return 0;
            }
            return node.data+sumOfAllNodes(node.left)+sumOfAllNodes(node.right);
        }

        public int diffOfEvenAndOddLevels(Node node){
            if(node == null){
                return 0;
            }
            return node.data-diffOfEvenAndOddLevels(node.left)-diffOfEvenAndOddLevels(node.right);
        }

        public int numberOfNodes(Node node){
            if(node == null){
                return 0;
            }
            return 1+numberOfNodes(node.left)+numberOfNodes(node.right);
        }

        public int numberOfLeafNodes(Node node){
            if(node == null){
                return 0;
            }
            if(node.left==null && node.right==null){
                return 1;
            }
            return numberOfLeafNodes(node.left)+numberOfLeafNodes(node.right);
        }
        }


    public class CreateBST1 {
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
        }


    }

