package com.example.segurityshoppingcart.Operational.Bookshop.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Library;

@Repository
public interface ILibraryRepository extends IBaseRepository<Library, Long>{

}
