package com.app.pagination.service;

import com.app.pagination.domain.Search;
import com.app.pagination.domain.SearchDTO;
import com.app.pagination.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final PostMapper postMapper1;

    public SearchDTO getResult(Search search){
        SearchDTO searchDTO = new SearchDTO();
        searchDTO.setFreePosts(postMapper1.selectSearch(search));
        searchDTO.setFreePostsTotalCount(postMapper1.selectTotal(search));
        return searchDTO;
    }

}
