/**
 * 
 */
package com.helloworld.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.helloworld.dao.BookRepository;
import com.helloworld.helloworld.entity.Books;

/**
 * @author admi
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository;
	
	public List<Books> getBooks() {
		return (List<Books>) repository.findAll();
	}
	
	public void add(Books dto) {
		repository.save(dto);
	}
}
