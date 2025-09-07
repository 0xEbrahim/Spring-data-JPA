package com.ibrahim.Jpa.repositories;

import com.ibrahim.Jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE authors SET authors.age=:age WHERE authors.id=:id")
    int updateAuthor(int age, int id);


    @Transactional
    List<Author> findByAge(@Param("age") int age);

    @Modifying
    @Transactional
    @Query("UPDATE authors SET authors.age=:age")
    int updateAllAuthorsAges(int age);

    List<Author> findByFirstName(String fn);
    List<Author> findByFirstNameContainingIgnoreCase(String fn);
    List<Author> findByFirstNameIgnoreCase(String fn);

}
