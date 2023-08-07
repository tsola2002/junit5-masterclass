package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class AnimalTests {
  private Animal animal;


//  @BeforeAll
//  void setupClass(){
//    int a = 3;
//    int b = 4;
//  }
//
//  @BeforeEach
//  void setup(){
//
//  }


  @Test
  void multiplyTwoNumbers(){

   // Animal animal = new Animal();
    assertEquals(12, animal.multiply(3,4), "3 * 4 should be equals to 12");

  }





}
