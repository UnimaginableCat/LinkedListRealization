package org.example;


public class MyLinkedListInteger {

  static class IntegerNode {

    Integer data;
    IntegerNode nextNode;

    public IntegerNode(Integer data) {
      this.data = data;
      this.nextNode = null;
    }
  }

  public IntegerNode head;
  private int size;

  public MyLinkedListInteger() {
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
  public void appendTestData(Integer firstValue, Integer secondValue, Integer thirdValue) {
    IntegerNode node1 = new IntegerNode(firstValue);
    IntegerNode node2 = new IntegerNode(secondValue);
    IntegerNode node3 = new IntegerNode(thirdValue);
    this.head = node1;
    this.head.nextNode = node2;
    this.head.nextNode.nextNode = node3;
    this.size = 3;
  }

  /**
   * gets item from array by index
   *
   * @param index index of item
   */
  public Integer getItem(int index) {
    if (this.head != null) {
      if (index > this.size - 1
          || index < 0) { // if index is below zero or more than size of an array throw exception
        throw new IndexOutOfBoundsException();
      }

      if (index == 0) { // if index is zero return head data
        return this.head.data;
      }

      int currentIndex = 0;
      IntegerNode currentNode = this.head;
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
   * method that returns size of array
   *
   * @return size of array
   */
  public int getSize() {
    return this.size;
  }

  /**
   * appends item to array
   *
   * @param data Integer number
   */
  public void append(Integer data) {
    IntegerNode newNode = new IntegerNode(data);

    if (this.head != null) { // if array is not empty
      IntegerNode currentNode = this.head; // getting first node
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
