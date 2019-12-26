package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node rootNode = new Node();
        rootNode.ChildItems = new ArrayList<Node>();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();

        node1.ChildItems = new ArrayList<Node>();
        node1.ChildItems.add(node2);
        node1.ChildItems.add(node3);

        node4.ChildItems = new ArrayList<Node>();
        node4.ChildItems.add(node5);

        node5.ChildItems = new ArrayList<Node>();
        node5.ChildItems.add(node6);

        node6.ChildItems = new ArrayList<Node>();
        node6.ChildItems.add(node7);

        rootNode.ChildItems.add(node1);
        rootNode.ChildItems.add(node4);

        int result = TreeHelper.GetTreeHeight(rootNode);
        System.out.println(String.format("Tree height is %s", result));
    }


}

