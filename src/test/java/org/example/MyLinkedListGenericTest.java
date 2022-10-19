package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLinkedListGenericTest {

  MyLinkedListGeneric<Integer> expectedLinkedList;

  /**
   * Creating test array
   */
  @BeforeEach
  void setup() {

    this.expectedLinkedList = new MyLinkedListGeneric<>();
    expectedLinkedList.appendTestData(1, 2, 3);
  }

  /**
   * Append item to array test
   */
  @Test
  void append() {
    // test
    MyLinkedListGeneric<Integer> actualLinkedList = new MyLinkedListGeneric<>();
    actualLinkedList.append(1);
    actualLinkedList.append(2);
    actualLinkedList.append(3);
    Assertions.assertEquals(expectedLinkedList.getItem(0), actualLinkedList.getItem(0));
    Assertions.assertEquals(expectedLinkedList.getItem(1), actualLinkedList.getItem(1));
    Assertions.assertEquals(expectedLinkedList.getItem(2), actualLinkedList.getItem(2));
  }


}