package com.example.project.ch04hamcrest;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {
  private static String FIRST_NAME = "John";
  private static String LAST_NAME = "Wick";

  private static Customer customer = new Customer(FIRST_NAME, LAST_NAME);


  @Test
  @DisplayName("Check correct customer properties")
  void checkCorrectCustomerProperties() {
    assertThat(customer, allOf(
        hasProperty("firstName", is(FIRST_NAME)),
        hasProperty("lastName", is(LAST_NAME))
    ));
  }


  @Test
  @DisplayName("Check isAnything() method")
  void checkIsAnything(){
    assertThat("World", is(equalTo("World")));
  }


  @Test
  @DisplayName("Hamcrest is, anyOf, allOf")
  public void testHamcrestIs() {
    int price1 = 1, price2 = 1, price3 = 2;

    assertThat(1, is(price1));
    assertThat(1, anyOf(is(price2), is(price3)));
    assertThat(1, allOf(is(price1), is(price2)));
  }


  @Test
  @DisplayName("testing objects")
  public void objectMatcher(){
    assertThat(new Customer("JOHN","WICK"), instanceOf(Customer.class));

  }

  @Test
  @DisplayName("text matcher")
  public void textMatcher(){

    assertThat("myValue", containsString("Val"));

  }

  @Test
  @DisplayName("collectionMatcher")
  public void collectionMatcher(){
    assertThat(new Integer[]{10,20,30},
        is(array(equalTo(10), equalTo(20), equalTo(30))));

  }

}