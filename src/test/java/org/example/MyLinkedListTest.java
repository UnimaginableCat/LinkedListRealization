package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

  MyLinkedList<Integer> expectedLinkedList;

  @BeforeEach
  void setup() {

    this.expectedLinkedList = new MyLinkedList<>();
    expectedLinkedList.appendTestData(1, 2, 3);
  }

  @Test
  void append() {
    // test
    MyLinkedList<Integer> actualLinkedList = new MyLinkedList<>();
    actualLinkedList.append(1);
    actualLinkedList.append(2);
    actualLinkedList.append(3);
    Assertions.assertEquals(expectedLinkedList.getItem(0), actualLinkedList.getItem(0));
    Assertions.assertEquals(expectedLinkedList.getItem(1), actualLinkedList.getItem(1));
    Assertions.assertEquals(expectedLinkedList.getItem(2), actualLinkedList.getItem(2));
  }


}