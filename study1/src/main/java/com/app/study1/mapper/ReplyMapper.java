package com.app.study1.mapper;

import com.app.study1.domain.PostVO;
import com.app.study1.domain.ReplyDTO;
import com.app.study1.domain.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ReplyMapper {
    public void insert(ReplyVO replyVO);

    public List<ReplyDTO> selectAll(Long postId);
}
