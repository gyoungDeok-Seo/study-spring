package com.app.study1.mapper;

import com.app.study1.domain.ReplyVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ReplyMapperTests {
    @Autowired
    private ReplyMapper replyMapper;

    @Test
    public void selectAllTest(){
        replyMapper.selectAll(21L).stream().map(ReplyVO::toString).forEach(log::info);
    }
}
