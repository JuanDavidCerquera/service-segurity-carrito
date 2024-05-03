package com.example.segurityshoppingcart.Operational.Bookshop.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Book;

@Repository
public interface IBookRepository extends IBaseRepository<Book, Long>{

}
