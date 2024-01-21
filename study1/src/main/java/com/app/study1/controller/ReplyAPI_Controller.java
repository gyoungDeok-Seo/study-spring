package com.app.study1.controller;

import com.app.study1.domain.ReplyDTO;
import com.app.study1.domain.ReplyVO;
import com.app.study1.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies/*")
@RequiredArgsConstructor
@Slf4j
public class ReplyAPI_Controller {
    private final ReplyMapper replyMapper;

    @PostMapping("write")
    public void write(@RequestBody ReplyVO replyVO){
        log.info(replyVO.toString());
        replyMapper.insert(replyVO);
    }

    @GetMapping("list/{post-id}")
    public List<ReplyDTO> getList(@PathVariable("post-id") Long postId){
        return replyMapper.selectAll(postId);
    }

    @GetMapping("test")
    public String test(){
        return "안녕";
    }


}
