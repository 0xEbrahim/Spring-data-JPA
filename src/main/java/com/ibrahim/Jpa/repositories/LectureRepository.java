package com.ibrahim.Jpa.repositories;

import com.ibrahim.Jpa.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {
}
