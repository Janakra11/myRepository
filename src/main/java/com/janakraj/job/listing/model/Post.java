package com.janakraj.job.listing.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];
}

