package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.model.Book;
import com.example.book.repository.Bookrepository;

@Service
public class Bookservice {
       @Autowired
       Bookrepository br;

	public List<Book> all() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	public Book getdetailsById(int id) {
		// TODO Auto-generated method stub
		return br.findById(id).orElse(null);
	}

	public boolean deletedetailsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveinfo(Book s) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book putinfo(Book v) {
		// TODO Auto-generated method stub
		return br.save(v);
	}
	
	   
}
