package com.app.study1.mapper;

import com.app.study1.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostMapperTests {
    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertTest(){
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 제목1");
        postVO.setPostContent("테스트 내용1");
        postVO.setMemberId(1L);

        postMapper.insert(postVO);
    }
}
