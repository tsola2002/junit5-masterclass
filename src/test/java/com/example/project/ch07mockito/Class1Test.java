package com.example.project.ch07mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Class1Test {

  @Test
  void itShouldMutiplyByTwo() {
    // Given

    //CREATING A MOCK OBJECT
    Class2Mock demoMockObject = Mockito.mock(Class2Mock.class);

    // When
    Mockito.when(demoMockObject.getA())
           .thenReturn(5);

    // Then
    Class1 class1 = new Class1();
    int actualResult  = class1.mutiplyByTwo(demoMockObject);

    assertEquals(10, actualResult, "This is not the correct answer");
  }
}