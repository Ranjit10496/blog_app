package com.sunglowsys.payloads;

import com.sunglowsys.enties.Category;
import com.sunglowsys.enties.User;

import java.util.Date;

public class PostDto {
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
}
