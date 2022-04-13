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

    public T get(int index) {
        if(index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == 0 && headNode.data != null){
            return headNode.data;
        }
        if(index == size && tailNode.data != null){
            return tailNode.data;
        }
        Node nodeOutput = headNode.nextNode;
        for(int i = 0; i!=index-1; i++){
            nodeOutput = nodeOutput.nextNode;
        }
        return nodeOutput.data;
    }

    public int find(T item) {
        int count = 0;
        Node node = headNode;
        for(int i = 0; i < size; i++){
            if(!node.data.equals(item) ){
                if(node.nextNode == null){
                    break;
                }
                node = node.nextNode;
                count++;
            } else if (node.data.equals(item)) {
                return count;
            }
        }
        return -1;
    }

    public boolean contains(T s) {
        if (find(s) >= 0) {
            return true;
        }
        return false;
    }



}

