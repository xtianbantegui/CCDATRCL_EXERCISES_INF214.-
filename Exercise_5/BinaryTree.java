// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node President = new Node("Pres.Bantegui");
        // Create node B
        Node VicePresident = new Node("VicePres.Reid");
        // Create node C
        Node Secretary = new Node("Sec.Gil");
        // Create node D
        Node Treasurer = new Node("Tres.Padilla");
        // Create node E
        Node  Auditor = new Node("Aud.Bernardo");
        // Create node F
        Node PublicRelationOfficer = new Node("PRO.Soberano");
        // Create node G
        Node PublicInformationOfficer = new Node("PIO.Lustre");

        // Set left and right child of root node A
        President.left = VicePresident;
        President.right = Secretary;

        // Set left and right child of node B
        VicePresident.left = Treasurer;
        VicePresident.right = Auditor;

        // Set left and right child of node C
        Secretary.left = PublicRelationOfficer;
        Secretary.right = PublicInformationOfficer;

   
        System.out.print("\nIn order Traversal: ");
        traverseInOrder(President);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(President);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(President);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
