package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        description = "Post DTO Model Information"
)
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 10, message = "Post title must have at least 10 character.")
    @Schema(description = "Blog Post Title")
    private String title;

    @NotEmpty
    @Size(min = 20, message = "Post title must have at least 20 character.")
    @Schema(description = "Blog Post Description")
    private String description;

    @NotEmpty
    @Schema(description = "Blog Post Content")
    private String content;
    private Set<Comment> comments;

    @Schema(description = "Blog Post Category")
    private Long categoryId;
}
