package com.fullstackJava.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import com.fullstackJava.springboot.learn_jpa_and_hibernate.Courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
