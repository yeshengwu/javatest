package interveiw;

public class ReverseSingleLink {
    public static Node revSingleLink(Node head) {
        if (head == null) { // ����Ϊ�ղ�������
            return head;
        }
        if (head.getNextNode() == null) { // ���ֻ��һ����㣬��Ȼ�����Ҳ��ͬһ��
            return head;
        }
        Node rhead = revSingleLink(head.getNextNode());
        head.getNextNode().setNextNode(head);
        head.setNextNode(null);
        return rhead;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node temp1 = null, temp2 = null;
        for (int i = 1; i < 100; i++) {
            temp1 = new Node(i);
            if (i == 1) {
                head.setNextNode(temp1);
            } else {
                temp2.setNextNode(temp1);
            }
            temp2 = temp1;
        }
        head = revSingleLink(head);
        while (head != null) {
            head = head.getNextNode();
        }
    }

}
