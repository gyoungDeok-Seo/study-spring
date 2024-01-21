package com.app.study1.mapper;

import com.app.study1.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface PostMapper {
    public void insert(PostVO postVO);

    public Optional<PostVO> selectOne(Long id);
}
