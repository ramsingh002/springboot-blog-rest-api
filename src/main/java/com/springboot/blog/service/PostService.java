package com.springboot.blog.service;

import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    //List<PostDto> getAllPosts(int pageNo, int pageSize);
    //PostResponse getAllPosts(int pageNo, int pageSize);
    //PostResponse getAllPosts(int pageNo, int pageSize, String sortBy);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getByPostId(Long id);

    PostDto updatePost(PostDto postDto, Long id);

    void deletePost(Long id);

    List<PostDto> getPostByCategory(Long categoryId);
}
