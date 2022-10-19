package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListSorterTest {


  MyLinkedListInteger expectedLinkedList;

  @BeforeEach
  void setUp() {
    this.expectedLinkedList = new MyLinkedListInteger();
    this.expectedLinkedList.appendTestData(5, 12, 31);
    this.expectedLinkedList.append(33);
    this.expectedLinkedList.append(46);

  }

  @Test
  void sortTest() {
    MyLinkedListInteger temporaryLinkedList = new MyLinkedListInteger();
    temporaryLinkedList.append(12);
    temporaryLinkedList.append(5);
    temporaryLinkedList.append(31);
    temporaryLinkedList.append(46);
    temporaryLinkedList.append(33);

    LinkedListSorter sorter = new LinkedListSorter(temporaryLinkedList);
    MyLinkedListInteger actualLinkedList = sorter.sort();

    for (int i = 0; i < temporaryLinkedList.getSize(); i++) {
      Assertions.assertEquals(expectedLinkedList.getItem(i), actualLinkedList.getItem(i));
    }


  }
}