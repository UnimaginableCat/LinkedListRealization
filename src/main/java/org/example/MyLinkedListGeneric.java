package org.example;

/**
 * My linked list realization
 *
 * @param <T> Type of items inside the array
 */
public class MyLinkedListGeneric<T> {

  static class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
      this.data = data;
      this.nextNode = null;
    }
  }

  public Node<T> head;
  private int size;

  public MyLinkedListGeneric() {
    this.head = null;
    this.size = 0;
  }

  /**
   * This method fills array with test data
   *
   * @param firstValue  first value
   * @param secondValue second value
   * @param thirdValue  third value
   */
  public void appendTestData(T firstValue, T secondValue, T thirdValue) {
    Node<T> node1 = new Node<>(firstValue);
    Node<T> node2 = new Node<>(secondValue);
    Node<T> node3 = new Node<>(thirdValue);
    this.head = node1;
    this.head.nextNode = node2;
    this.head.nextNode.nextNode = node3;
    this.size = 3;
  }

  /**
   * gets item from array by index
   *
   * @param index index of item
   * @return item of type T
   */
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
      while (currentNode.nextNode != null) { // searching for the last node in array
        currentNode = currentNode.nextNode;
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

  /**
   * method that gets size of array
   *
   * @return size of array
   */
  public int getSize() {
    return this.size;
  }

  /**
   * appends item to array
   *
   * @param data item of type T
   */
  public void append(T data) {
    Node<T> newNode = new Node<>(data);

    if (this.head != null) { // if array is not empty
      Node<T> currentNode = this.head; // getting first node
      while (currentNode.nextNode != null) { // searching for the last node in array
        currentNode = currentNode.nextNode;
      }
      currentNode.nextNode = newNode; // appending new node to last node
    } else { // if array is empty just adding newNode as a head
      this.head = newNode;
    }
    this.size++;
  }
}
