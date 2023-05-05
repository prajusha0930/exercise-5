package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.Bookservice;




@RestController
public class BookController {
       @Autowired
       Bookservice bs;
       @GetMapping(value="/")
	    public List<Book> all(){
	    	return bs.all();
	    }
	    @GetMapping("/{id}")
	    public Book getdetailsById(@PathVariable int id) {
	    	return bs.getdetailsById(id);
	    }
	    @DeleteMapping("/{id}")
	    public boolean deletedetailsById(@PathVariable int id) {
	    	 return bs.deletedetailsById(id);
	    	 
	    }
	    @PostMapping("/")
	    public boolean saveinfo(@RequestBody Book s) {
	    	return bs.saveinfo(s);
	    }
	    @PutMapping("/{id}")
	    public Book putinfo(@RequestBody Book v) {
	    	return bs.putinfo(v);
	    }
}
