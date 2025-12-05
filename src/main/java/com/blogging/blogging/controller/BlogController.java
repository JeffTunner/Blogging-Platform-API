package com.blogging.blogging.controller;

import com.blogging.blogging.entity.Blog;
import com.blogging.blogging.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String api() {
        return "Blogging Platform API!!!";
    }

    @PostMapping("/blog/create")
    public Blog create(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @PutMapping("/blog/update/{id}")
    public Blog update(@PathVariable Long id, @RequestBody Blog blog) {
        return blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/blog/delete/{id}")
    public List<Blog> delete(@PathVariable Long id) {
        return blogService.deleteBlog(id);
    }

    @GetMapping("/blog/info/{id}")
    public Blog getById(@PathVariable Long id) {
        return blogService.getById(id);
    }

    @GetMapping("/blog/all")
    public List<Blog> getAll() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/blog/{search}")
    public List<Blog> filter(@PathVariable String search) {
        return blogService.filterByTags(search);
    }
}
