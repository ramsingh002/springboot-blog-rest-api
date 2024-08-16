package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private Long id;

    @NotEmpty(message = "Name should not be Null or Empty")
    private String name;

    @Email
    @NotEmpty(message = "Email should not be Null or Empty")
    private String email;

    @NotEmpty
    @Size(min = 30, message = "Comment must be minimum 30 character.")
    private String body;
}
