package com.example.project.ch02lifecycle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class SUTTest {

  private SUT systemUnderTest;

  private static ResourceForAllTests resourceForAllTests;

  @BeforeAll
  static void setUpClass() {
    resourceForAllTests = new ResourceForAllTests("Our resource for all tests");
  }


  @BeforeEach
  void setUp() {

    systemUnderTest = new SUT("Our system under test");
  }

  @Test
  @DisplayName("Regular Work")
  void testRegularWork(){
    boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWork();
    assertTrue(canReceiveRegularWork);
  }

  @Test
  @DisplayName("Additional Work")
  void testAdditionalWork() {
    boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionalWork();
    assertFalse(canReceiveAdditionalWork);
  }

  @AfterEach
  void tearDown() {
    systemUnderTest.close();
  }

  @AfterAll
  static void tearDownClass() {
    resourceForAllTests.close();
  }

}
