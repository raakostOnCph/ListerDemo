package com.company;

public class Liste
{
    Node head = null;
    Node tail = null;


    public boolean isEmpty()
    {

        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    public Node insertFromHead(Node node)
    {
        if (isEmpty()) {

            head = node;
            tail = node;
            return head;
        }

        node.next = head;
        head.previous = node;
        head = node;
        return head;


    }

    public String printFromHead()
    {

        Node n = head;

        String res = "";

        while (n != null) {

            res += n.data;
            n = n.next;
        }

        return res;

    }

    public String printFromTail()
    {

        Node n = tail;
        String res = "";

        while (n != null) {

            res += n.data;

            n = n.previous;
        }
        return res;
    }


    public Node removeFromHead()
    {
        Node node = new Node("");
        if (isEmpty()) {

            return node;
        }
        if (head == tail) {

            node = head;
            head = null;
            tail = null;
            return node;
        }

         node = head;

        head = head.next;

        head.previous.next = null;
        head.previous = null;
        return node;
    }
}
