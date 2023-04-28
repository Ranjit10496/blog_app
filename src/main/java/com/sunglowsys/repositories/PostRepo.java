package com.sunglowsys.repositories;

import com.sunglowsys.enties.Category;
import com.sunglowsys.enties.Post;
import com.sunglowsys.enties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
