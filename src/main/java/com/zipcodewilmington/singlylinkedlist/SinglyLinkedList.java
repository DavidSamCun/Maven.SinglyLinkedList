package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    public class Node{
        T data;
        Node nextNode;

        public Node(T data){
            this.data = data;
            this.nextNode = null;
        }
    }

    Node headNode = null;
    Node tailNode = null;
    int size = 0;

    public SinglyLinkedList() {
    }

    public Boolean add(T input) {
//        headNode.data = input;
//        headNode.nextNode = new Node();
//        size++;
        Node newNode = new Node(input);

        if(headNode == null){
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
        }
        tailNode = newNode;
        size++;

        return true;
    }

    public Integer size(){
        return size;
    }


}

