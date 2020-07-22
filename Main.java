/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

import java.util.Scanner;

/**
 *
 * @author tigerye
 */
public class Main {

    public static void main(String[] args) {
        // Create a new linked list
        Scanner sc = new Scanner(System.in);
        Queue list = new Queue();

        // Add new nodes
        list.enqueue(new Node(1));
        list.enqueue(new Node(88));
        list.enqueue(new Node(67));
        list.enqueue(new Node(101));
        list.enqueue(new Node(4));
        list.enqueue(new Node(-1));
        list.enqueue(new Node(72));

        // Display contents of linked list
        list.display();
        System.out.println("What number would you like to remove?");
        int number = sc.nextInt();
        list.dequeue();
        list.display();
    }
}
