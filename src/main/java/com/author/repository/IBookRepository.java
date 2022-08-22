package com.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.author.Model.Book;



@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

}
