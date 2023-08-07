package com.example.project.ch06stub;

public class StubBookDAO implements IBookDao{

  @Override
  public boolean saveBookDetails(Book newBook) {
    return true;
  }
}
