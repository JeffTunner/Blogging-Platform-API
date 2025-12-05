package com.blogging.blogging.service;

import com.blogging.blogging.entity.Blog;
import com.blogging.blogging.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepository repo;

    public Blog createBlog(Blog blog) {
        return repo.save(blog);
    }

    public List<Blog> getAllBlogs() {
        return repo.findAll();
    }

    public Blog getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Blog updateBlog(Long id, Blog blog) {
        Blog existing = repo.findById(id).orElse(null);
        if(existing == null) return null;

        existing.setTitle(blog.getTitle());
        existing.setContent(blog.getContent());
        existing.setCategory(blog.getCategory());
        existing.setTags(blog.getTags());

        return repo.save(existing);
    }

    public List<Blog> deleteBlog(Long id) {
        repo.delete(getById(id));
        return repo.findAll();
    }

    public List<Blog> filterByTags(String term) {
        return repo.findByKeyword(term);
    }
}
