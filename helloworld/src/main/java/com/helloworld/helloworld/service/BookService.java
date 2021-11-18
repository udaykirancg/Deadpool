/**
 * 
 */
package com.helloworld.helloworld.service;

import java.util.List;

import com.helloworld.helloworld.entity.Books;

/**
 * @author admi
 *
 */
public interface BookService {
	public List<Books> getBooks();
	public void add(Books books);
}
