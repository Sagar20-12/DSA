import java.util.*;
public class BST {
    static class Node{ // time complexity  = O(H)
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    // INSERTING AN ELEMENT IN THE BST AND IT WILL GIVE US SORTED INORDER
    // AFTER PRINTING THE INSERTED NODES
    public static Node insert(Node root, int val){
       if (root == null){
           root = new Node(val);
           return root;
       }

       if (root.data>val){

           //in left subtree
           root.left = insert(root.left, val);
       } else{
           root.right = insert(root.right, val);
       }
       return root;
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);

    }

    // BST PROGRAM TO SEARCH IF A NODE IS PRESENT IN IT OR NOT
    // IT IS SAME AS BINARYS SEARCH BUT IN PLACE OF ELEMENT WE HAVE NODE ROOT

    public static boolean search(Node root, int key){
        if (root == null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }

    }

    // BST PROGRAM TO DELETE IN A NODE
    // IN THIS WE HAVE TO TRAVERSE INORDER SUCCESSOR
    public static Node delete(Node root, int val){
        if (root.data>val){
            root.left = delete(root.left, val);
        }else if(root.data<val){
            root.right = delete(root.right, val);
        }
        else{ //root.data == val;
            //case1
            if (root.left == null && root.right == null){
                return null;
            }

            //case 2
            if (root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            // case 3 (to search for inorder successor) means leftmost node in right subtree
            Node IS = inordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inordersuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;

    }

    // TO PRINT THE NUMBERS IN THE RANGE IN BST
    // YOU HAVE GIVEN TWO VALUES IN THE BST
    // SAME YOU HAVE TO GO IN LEFT AND RIGHT FOT THIS PROBLEM ALSO
    public static void printinrange(Node root, int x, int y){
        if (root == null){
            return;
        }
        if (root.data>=x&& root.data<=y){
            printinrange(root.left, x,y);
            System.out.println(root.data+ " ");
            printinrange(root.right, x, y);
        }
        else if (root.data>=y){
            printinrange(root.left, x, y);
        } else{
            printinrange(root.right ,x, y);
        }

    }

    //ROOT TO LEAF PATHS(MEANS WE HAVE TO PRINT THE ALL THE NODES FROM NODE ROOT TO THE LEAF)
    // IN THIS WE ARE GOING TO USE ARRAY LIST
    public static void printPath(ArrayList<Integer> path ){
        for (int i = 0; i <path.size() ; i++) {
            System.out.print(path.get(i)+" ->");
            
        }
        System.out.println();
    }
    public static void print2leaf(Node root,ArrayList<Integer> path ){
        if (root == null){
            return;
        }
        path.add(root.data);
        // leaf node condition
        if (root.left == null && root.right == null){
            printPath(path);
        }else{ // for non leaf nodes
            print2leaf(root.left, path);
            print2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);

        }
        inorder(root);
        System.out.println();

        if (search(root,20)){
            System.out.println("found");
        } else{
            System.out.println("nahi mila bhai kya karu");
        }

        delete(root, 4);
        inorder(root);

        printinrange(root,6 ,10);

        print2leaf(root, new ArrayList<>());

    }
}
