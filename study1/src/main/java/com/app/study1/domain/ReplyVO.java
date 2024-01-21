package com.app.study1.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReplyVO {
    private Long id;
    private String replyContent;
    private Long memberId;
    private Long postId;
}
