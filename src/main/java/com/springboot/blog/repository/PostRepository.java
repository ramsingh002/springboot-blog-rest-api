package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//No Required to annotated because SimpleJpaRepository implements
//JpaRepositoryImplementation and SimpleJpaRepository annotated with
// @Repository and @Transactional sot @Repository is Optional
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);
}
