package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(
            @PathVariable("postId") Long postId,
            @Valid @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.createComment(postId,commentDto),
                HttpStatus.CREATED);
    }

    @GetMapping("posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(
            @PathVariable("postId") Long postId){

        return ResponseEntity.ok()
                .body(commentService.getCommentsByPostId(postId));
    }

    @GetMapping("posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> getCommentsByPostId(
            @PathVariable("postId") Long postId,
            @PathVariable("commentId") Long commentId){

        return new ResponseEntity<>(
                commentService.getCommentsById(postId, commentId),
                HttpStatus.OK
        );
    }

    @PutMapping("posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateComment(
            @PathVariable("postId") Long postId,
            @PathVariable("commentId") Long commentId,
            @Valid @RequestBody CommentDto commentDto){
        return ResponseEntity.ok()
                .body(commentService.updateComment(postId, commentId, commentDto));

    }

    @DeleteMapping("posts/{postId}/comments/{commentId}")
    public ResponseEntity<String> deletePost(@PathVariable("postId") Long postId,
                                             @PathVariable("commentId") Long commentId){
        commentService.deleteComment(postId, commentId);
        return ResponseEntity.ok().body("Comment Id : '"+commentId+"' Deleted Successfully.");
    }
}
