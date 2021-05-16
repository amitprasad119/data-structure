package datastructure.tree;

public class BinaryTree {

    private Node<Character> root = null;
    Node<Character> createTree() {
        root = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');

       root.setLeftChild(b);
       root.setRightChild(c);
       c.setLeftChild(d);
       c.setRightChild(e);
       d.setLeftChild(f);
       d.setRightChild(h);
       e.setRightChild(g);
      return  root;
     }

     void postOrder(Node<Character> root) {
         if(root == null) {
             return;
         }
        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        System.out.print(root.getData() + "->");
     }

     void inOrder(Node<Character> root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeftChild());
         System.out.print(root.getData() + "->");
         inOrder(root.getRightChild());
     }

     void preOrder(Node<Character> root) {
        if(root == null) {
            return;
        }
         System.out.print(root.getData() + "->");
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
     }
}
