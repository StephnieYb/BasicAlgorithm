/**
 * Created by yxc on 2017/6/23.
 */

public class MyLinkList {
    public Node head;

    public static void main(String args[]) {
        MyLinkList list = new MyLinkList(new int[]{13, 10, 35, 24, 22, 5});
        list.visit();
    }

    public MyLinkList(int[] input) {
        Node temp = head;
        for (int i = 0; i < input.length; i++) {
            if (head == null) {
                head = new Node(input[i]);
                temp = head;
            } else {
                temp.next = new Node(input[i]);

                temp = temp.next;
            }
        }
    }

    private void visit() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }

    private class Node {
        int data;
        Node next = null;

        public Node(int i) {
            data = i;
        }
    }
}

