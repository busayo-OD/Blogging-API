package com.springboot.blog.service;

import com.springboot.blog.dto.BlogDto;
import com.springboot.blog.dto.BlogResponse;

import java.util.List;

public interface BlogService {
    BlogDto createBlog(BlogDto blogDto);

    BlogResponse getAllBlogs(int pageNo, int pageSize, String sortBy,String sortDir);

    BlogDto getBlogById(Long id);

    BlogDto updateBlog(BlogDto blogDto, Long id);

    void deleteBlog(Long id);

    List<BlogDto> getBlogsByCategory(Long categoryId);
}
