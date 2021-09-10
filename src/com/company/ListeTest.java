package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste listeTom = new Liste();
    Liste listemedTal = new Liste();



    @BeforeEach
    void setUp()
    {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        listemedTal.insertFromHead(node0);
        listemedTal.insertFromHead(node1);
        listemedTal.insertFromHead(node2);
        listemedTal.insertFromHead(node3);
    }



    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        assertEquals(true, listeTom.isEmpty());
    }


    @Test
    void insetFromHead()
    {
         Node node = new Node("hej");

         assertEquals(node, listeTom.insertFromHead(node));

         Node node1 = new Node("med");

         assertEquals(node1, listeTom.insertFromHead(node1));

         Node node2 = new Node("dig");

         assertEquals(node2, listeTom.insertFromHead(node2));

    }

    @Test
    void printFromHead()
    {

        assertEquals("3210", listemedTal.printFromHead() );
        assertEquals("",listeTom.printFromHead());


    }


    @Test
    void PrintFromTail()
    {

        assertEquals("0123",listemedTal.printFromTail());
    }


    @Test
    void removeFromHead()
    {

        Node node = new Node("");

        assertEquals(node.data, listeTom.removeFromHead().data);

       Node testNode = new Node("4");

       listeTom.insertFromHead( testNode);
        assertEquals(testNode, listeTom.removeFromHead());
        assertEquals(true, listeTom.isEmpty());

        assertEquals("3", listemedTal.removeFromHead().data );
        assertEquals("210", listemedTal.printFromHead());


    }

    @Test
    void removeFromTail()
    {

        assertEquals("", listeTom.removeFromTail().data);

        Node testNode = new Node("test");

        listeTom.insertFromHead(testNode);

        assertEquals(testNode, listeTom.removeFromTail());
        assertEquals(true, listeTom.isEmpty());

        assertEquals("0", listemedTal.removeFromTail().data);

        assertEquals("321", listemedTal.printFromHead());

    }

    @Test
    void indsætterbagfra()
    {
        Node testNode = new Node("1");

        assertEquals(testNode, listeTom.insertFromTail(testNode));

        Node testNode1 = new Node("2");

        assertEquals(testNode1, listeTom.insertFromTail(testNode1));

        assertEquals("12", listeTom.printFromHead());
    }
}

