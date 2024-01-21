package com.app.pagination.mapper;

import com.app.pagination.domain.Pagination;
import com.app.pagination.domain.PostVO;
import com.app.pagination.domain.Search;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
//    게시글 추가
    public void insert(PostVO postVO);

//    게시글 전체 목록 조회
    public List<PostVO> selectAll(@Param("pagination") Pagination pagination, @Param("search") Search search);

//    게시글 전체 개수
    public int selectTotal(Search search);

//    통합 검색 중 자유 게시판 검색
    public List<PostVO> selectSearch(Search search);

}


















