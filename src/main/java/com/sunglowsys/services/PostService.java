package com.sunglowsys.services;

import com.sunglowsys.enties.Post;
import com.sunglowsys.payloads.PostDto;


import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    Post updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    List<Post> getallPost();
    Post getPostById(Integer postId);
    List<Post> getPostsByCategory(Integer categoryId);
    List<Post> getPostsByUser(Integer categoryId);
    List<Post> searchPosts(String keyword);
}
