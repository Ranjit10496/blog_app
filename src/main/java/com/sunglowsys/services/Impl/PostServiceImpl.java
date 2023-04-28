package com.sunglowsys.services.Impl;

import com.sunglowsys.enties.Category;
import com.sunglowsys.enties.Post;
import com.sunglowsys.enties.User;
import com.sunglowsys.exceptions.ResourceNotFoundException;
import com.sunglowsys.payloads.PostDto;
import com.sunglowsys.repositories.CategoryRepo;
import com.sunglowsys.repositories.PostRepo;
import com.sunglowsys.repositories.UserRepo;
import com.sunglowsys.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {
        User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","User id",userId));
        Category category = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category","Category Id",categoryId));
        Post post = this.modelMapper.map(postDto,Post.class);
        post.setImageName("default.png");
        post.setAddedDate(new Date());
        post.setUser(user);
        post.setCategory(category);
        Post newPost = this.postRepo.save(post);

        return this.modelMapper.map(newPost,PostDto.class);
    }

    @Override
    public Post updatePost(PostDto postDto, Integer postId) {
        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> getallPost() {
        return null;
    }

    @Override
    public Post getPostById(Integer postId) {
        return null;
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId) {
        return null;
    }

    @Override
    public List<Post> getPostsByUser(Integer categoryId) {
        return null;
    }

    @Override
    public List<Post> searchPosts(String keyword) {
        return null;
    }
}
