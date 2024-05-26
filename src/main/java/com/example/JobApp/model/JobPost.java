package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobPost {
    private int postId;
    private String PostProfile;
    private String PostDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
