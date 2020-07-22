/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author tigerye
 */
public class p0pmachine {

    private Node head;
    private Node before;
    private Node after;

    // MyLinkedList Constructor
    public p0pmachine() {
        this.head = null;
        this.before = null;
        this.after = null;
    }

    // This method finds the proper place for the new node to be inserted
    // At the end of the method call, before points to the node that will be before 
    // the new node and after points to the node ahead of the new node
    public void search() {
        before = null;
        after = head;
        while (after != null) {
            before = after;
            after = after.getNext();
        }
    }

    void push(Node node) {
        search();
        if (before == null && after == null) {
            head = node;
        } else if (before == null && after != null) {
            node.setNext(head);
            head = node;
        } else if (before != null && after != null) {
            before.setNext(node);
            node.setNext(after);
        } else {
            before.setNext(node);
        }
    }

    Object peek() {
        return head;
    }

    void pop() {
        search();
        before.setNext(null);
    }

    boolean isEmpty() {
        return head == null;
    }

}
