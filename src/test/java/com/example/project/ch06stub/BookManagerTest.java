package com.example.project.ch06stub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BookManagerTest {

  public BookManagerTest() {
  }

  @Test
  void itShouldSave() {
    // Given
    StubBookDAO stub = new StubBookDAO();
    BookManager bm = new BookManager(stub);
    // When
    boolean result = bm.save(new Book("I12345",
                    "Programming in Java",
                    Arrays.asList("Andrew","Nancy"),
        "New Publications",
        2010));

    // Then
    assertEquals(true, result);
  }
}