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
        if(headNode.data.equals(item)){
            return 0;
        }

        int count = 1;
        Node node = headNode.nextNode;

        for(int i = 0; i < size; i++){
            if(node != null){
                break;
            }
            if(!node.data.equals(item) ){
                node = node.nextNode;
                count++;
            } else {
                return count;
            }
        }

        return -1;
    }

}

