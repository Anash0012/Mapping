package com.example.Mapping.Repository;

import com.example.Mapping.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, String> {
}
