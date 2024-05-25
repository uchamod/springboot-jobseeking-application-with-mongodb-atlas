package com.job_app.collection;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "job_posts")
public class JobPosts {
    private String id;
    private String job_role;
    private String description;
    private Integer years_of_experience;
    private List<String> skill_set;


}
