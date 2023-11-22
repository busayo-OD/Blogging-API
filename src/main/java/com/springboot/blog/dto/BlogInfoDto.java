package com.springboot.blog.dto;

import com.springboot.blog.annotation.BlogStateAnnotation;
import com.springboot.blog.model.Category;
import com.springboot.blog.model.enums.BlogState;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class BlogInfoDto {
    private Long id;

    private String title;

    private String description;

    private String content;

    private Set<CommentDto> comments;

    private Category category;

    @BlogStateAnnotation(enumClass = BlogState.class)
    private String state;

    private int readingCount;

    private String readingTime;

    private List<TagDto> tags;

    private UserInfoDto owner;

    private Date createdOn;

    private Date updatedOn;
}
