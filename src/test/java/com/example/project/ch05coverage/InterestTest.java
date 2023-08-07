package com.example.project.ch05coverage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

  double p = 1000.0;
  double rate = 10.0;
  int time = 2;
  int n=5;
  Interest instance = new Interest();
  EmiCalculator e=new EmiCalculator();

  public InterestTest() {
  }

  @Test
  void itShouldSimpleInterestCal() {
    // Given

    // When
    System.out.println("simpleInterestCal");
    long expResult = 200;
    long result = instance.simpleInterestCal(p, rate, time);
    assertEquals(expResult, result);

    // Then
  }

  @Test
  void itShouldCompoundInterestCal() {
    // Given

    // When
    System.out.println("compoundInterestCal");
    long expResult = 9000000;
    long result = instance.compoundInterestCal(p, rate, time, n);
    assertEquals(expResult, result);

    // Then
  }

  @Test
  public void testEmiCal() {
    System.out.println("EMICal");
    double p = 1000000.0;
    double rate = 10.5;
    int time = 10;
    long expResult = 13493;
    long result = e.calculateEmi(p, rate, time);
    assertEquals(expResult, result);
  }
}