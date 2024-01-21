package com.app.pagination.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class SearchDTO {
    private List<PostVO> freePosts;
    private int freePostsTotalCount;
}
