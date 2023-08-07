package com.example.project.ch04hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


public class Hamcrest {

  @Test
  public void testStringObject(){
    String actual = "Hello";

    MatcherAssert.assertThat(actual, Matchers.is("Hello"));

  }

}
