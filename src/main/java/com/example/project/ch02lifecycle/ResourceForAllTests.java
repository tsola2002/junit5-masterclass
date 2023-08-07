package com.example.project.ch02lifecycle;

public class ResourceForAllTests {
  private String resourceName;

  public ResourceForAllTests(String resourceName) {
    this.resourceName = resourceName;
    System.out.println(resourceName + " from class " + getClass().getSimpleName() + " is initializing RESOURCE.");
  }

  public void close() {
    System.out.println(resourceName + " from class " + getClass().getSimpleName() + " is closing RESOURCE.");
  }
}
