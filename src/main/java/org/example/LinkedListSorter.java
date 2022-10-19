package org.example;


import org.example.MyLinkedListInteger.IntegerNode;

public class LinkedListSorter {

  private MyLinkedListInteger linkedList;

  LinkedListSorter(MyLinkedListInteger sortingLinkedList) {
    this.linkedList = new MyLinkedListInteger();
    if (sortingLinkedList.getSize() > 0) {
      for (int i = 0; i < sortingLinkedList.getSize(); i++) {
        Integer data = sortingLinkedList.getItem(i);
        this.linkedList.append(data);
      }
    }
  }

  public MyLinkedListInteger sort() {
    for (int i = 0; i < this.linkedList.getSize(); i++) {
      IntegerNode currentNode = this.linkedList.head;
      IntegerNode next = this.linkedList.head.nextNode;
      for (int j = 0; j < this.linkedList.getSize() - 1; j++) {
        if (currentNode.data > next.data) {
          int temp = currentNode.data;
          currentNode.data = next.data;
          next.data = temp;
        }
        currentNode = next;
        next = next.nextNode;
      }
    }
    return this.linkedList;
  }

}
