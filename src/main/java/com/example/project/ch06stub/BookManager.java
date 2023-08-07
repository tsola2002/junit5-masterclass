package com.example.project.ch06stub;

import java.util.Arrays;

public class BookManager {
  IBookDao bDao = null;
  Book newBook = new Book("I12345",
                      "Programming in Java",
                      Arrays.asList("Andrew","Nancy"),
                    "New Publications",
                    2010);

  public BookManager()
  {
    this.bDao = new BookDAO();
  }

  public BookManager(IBookDao newBookDao) {
    this.bDao = newBookDao;
  }

  public boolean save(Book newBook){
    return(bDao.saveBookDetails(newBook));
  }


}
