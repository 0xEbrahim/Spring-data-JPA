package com.ibrahim.Jpa.repositories;

import com.ibrahim.Jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Author, Integer> {

}
