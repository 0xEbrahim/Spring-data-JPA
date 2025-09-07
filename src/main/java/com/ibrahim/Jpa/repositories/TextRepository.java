package com.ibrahim.Jpa.repositories;

import com.ibrahim.Jpa.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {
}
