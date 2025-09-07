package com.ibrahim.Jpa.repositories;

import com.ibrahim.Jpa.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
