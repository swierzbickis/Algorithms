package com.learning.list;


public interface List {

    <T> T get(int idx);

    void printList();

    boolean clearList();

    boolean isEmpty();

    <T> boolean add(T obj);

    boolean remove(int idx);
}
