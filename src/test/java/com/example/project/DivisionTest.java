package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivisionTest {

  @Test
  void divide(){
    Division division = new Division();
    assertEquals(3, division.divide(12, 4), "12/4 should be equals 3");

  }

}
