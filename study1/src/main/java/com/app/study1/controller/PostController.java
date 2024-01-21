package com.app.study1.controller;

import com.app.study1.domain.PostVO;
import com.app.study1.mapper.PostMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostMapper postMapper;

    @PostMapping("/post/write")
    public RedirectView write(PostVO postVO){
        postMapper.insert(postVO);
        return new RedirectView("/post/read/" + postVO.getId());
    }

    @GetMapping("/post/read/{id}")
    public String read(@PathVariable Long id, Model model){
        Optional<PostVO> foundPost = postMapper.selectOne(id);
        if(foundPost.isPresent()){
            model.addAttribute("post", foundPost.get());
            return "/post/read";
        }else{
            return "/error";
        }
    }
}



















