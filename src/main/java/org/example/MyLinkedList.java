package org.example;

import java.util.List;

public class MyLinkedList<T> {

  static class Node<T> {

    T data;
    Node<T> nextItem;

    public Node(T data) {
      this.data = data;
      this.nextItem = null;
    }
  }

  private Node<T> head;
  private int size;

  public MyLinkedList() {
    this.head = null;
    this.size = 0;
  }

  public void appendTestData(T firstValue, T secondValue, T thirdValue) {
    Node<T> node1 = new Node<>(firstValue);
    Node<T> node2 = new Node<>(secondValue);
    Node<T> node3 = new Node<>(thirdValue);
    this.head = node1;
    this.head.nextItem = node2;
    this.head.nextItem.nextItem = node3;
    this.size = 3;
  }

  public T getItem(int index) {
    if (this.head != null) {
      if (index > this.size - 1
          || index < 0) { // if index is below zero or more than size of an array throw exception
        throw new IndexOutOfBoundsException();
      }

      if (index == 0) { // if index is zero return head data
        return this.head.data;
      }

      int currentIndex = 0;
      Node<T> currentNode = this.head;
      while (currentNode.nextItem != null) { // searching for the last node in array
        currentNode = currentNode.nextItem;
        currentIndex++;
        if (index == currentIndex) {
          return currentNode.data;
        }
      }
    } else { // if array is empty return null
      return null;
    }
    return null;
  }

  public int getSize() {
    return this.size;
  }

  public void append(T data) {
    Node<T> newNode = new Node<>(data);

    if (this.head != null) { // if array is not empty
      Node<T> currentNode = this.head; // getting first node
      while (currentNode.nextItem != null) { // searching for the last node in array
        currentNode = currentNode.nextItem;
      }
      currentNode.nextItem = newNode; // appending new node to last node
    } else { // if array is empty just adding newNode as a head
      this.head = newNode;
    }
    this.size++;
  }
}
