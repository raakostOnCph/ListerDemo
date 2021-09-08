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
}
