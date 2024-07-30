package com.koifish.controller;

import com.koifish.domain.ResponseResult;
import com.koifish.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // @GetMapping("/list")
    // public List<Article> test() {
    //     return articleService.list();
    // }

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {
        ResponseResult result = articleService.findHotArticleList();
        return result;
    }
}
