package application;

import structures.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Lista atual: ");
        list.display();

        // Remove elements
        list.remove(30);
        System.out.println("Lista após remover o elemento 30: ");
        list.display();
    }
}
