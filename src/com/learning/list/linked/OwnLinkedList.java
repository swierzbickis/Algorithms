package com.learning.list.linked;

import com.learning.list.List;

import java.util.NoSuchElementException;

public class OwnLinkedList<T> implements List {

    private int counter;
    private Node<T> header;

    @Override
    public T get(int idx) {

        Node loopNode = header;
        int i = 0;
        while (loopNode.getNextNode() != null) {
            if (i == idx) {
                return (T) loopNode.getData();
            }
            i++;
            loopNode = loopNode.getNextNode();
        }

        throw new NoSuchElementException("Cannot found Object with given index: " + idx);
    }

    @Override
    public void printList() {

    }

    @Override
    public boolean clearList() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public <T> boolean add(T obj) {

        if (obj == null) {
            throw new NullPointerException("Cannot insert null to the List");
        }

        Node<T> newNode = new Node<>(obj);

        if (header == null) {
            this.header = newNode;
            return true;
        }
        Node previousHeader = this.header;
        this.header = newNode;
        previousHeader.setNextNode(newNode);
        incrementCounter();
        return true;
    }

    @Override
    public boolean remove(int idx) {
        return false;
    }

    private void decrementCounter() {
        this.counter--;
    }

    private void incrementCounter() {
        this.counter++;
    }


    private class Node<T> {
        private T data;
        private Node nextNode;


        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
