package com.ilionx.lab.example.pglimit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, String>, PagingAndSortingRepository<Post, String> {

}
