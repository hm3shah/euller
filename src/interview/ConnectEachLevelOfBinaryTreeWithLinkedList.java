package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 *
 *              a
 *             / \
 *           b <- c
 *           / \ / \
 *          d<-e<-f<-g
 *
 *
 */
public class ConnectEachLevelOfBinaryTreeWithLinkedList {


    static List<List<Node>> function(Node n) {
        Queue<Node> current = new LinkedList<>();
        current.add(n);
        Queue<Node> next = new LinkedList<>();
        List<Node> nodeList = new ArrayList<>();
        List<List<Node>> result = new ArrayList<>();

        while(!current.isEmpty()) {
            Node temp = current.poll();
            nodeList.add(temp);
            if(temp.right != null) {
                next.add(temp.right);
            }
            if(temp.left != null) {
                    next.add(temp.left);
            }


            if(current.isEmpty()) {
                current = next;
                next = new LinkedList<>();
                result.add(nodeList);
                nodeList = new ArrayList<>();
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        a.left=b;
        a.right=c;
        Node d = new Node('d');
        Node e = new Node('e');
        b.left=d;
        b.right=e;
        Node f = new Node('f');
        Node g = new Node('g');
        c.left=f;
        c.right=g;
        List<List<Node>> result = function(a);
        System.out.println();
    }

}

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}