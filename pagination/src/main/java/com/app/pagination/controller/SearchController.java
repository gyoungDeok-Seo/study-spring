package com.app.pagination.controller;

import com.app.pagination.domain.Search;
import com.app.pagination.domain.SearchDTO;
import com.app.pagination.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @GetMapping("results/search")
    public SearchDTO getResult(Search search){
        return searchService.getResult(search);
    }
}
