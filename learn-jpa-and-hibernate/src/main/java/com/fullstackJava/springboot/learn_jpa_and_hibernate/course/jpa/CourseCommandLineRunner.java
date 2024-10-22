package com.fullstackJava.springboot.learn_jpa_and_hibernate.course.jpa;

import com.fullstackJava.springboot.learn_jpa_and_hibernate.Courses.Course;
import com.fullstackJava.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS now!","Saswat"));
        repository.save(new Course(2,"Learn JPA Now!","Saswat"));
        repository.save(new Course(3,"Learn DevOps now!","Saswat"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Saswat"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS now!"));
        System.out.println(repository.findByName("Learn JPA Now!"));



    }
}
