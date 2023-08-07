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

    // Then
  }
}