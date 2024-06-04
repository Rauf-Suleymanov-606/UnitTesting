package com.example.unittesting;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class User {
    private String userName;
    private String password;
    private String role;
    private List<String> posts;
    private int id;
    public List<String> getAllPostsContainingWord(String word) {
        List<String> filteredPosts = new ArrayList<>();
        for(String post: posts) {
            if(post.contains(word))
                filteredPosts.add(post);
        }
        return filteredPosts;
    }
}
