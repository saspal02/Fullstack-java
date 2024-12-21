package com.fullstackJava.rest.webservices.restful_web_services.Jpa;

import com.fullstackJava.rest.webservices.restful_web_services.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
