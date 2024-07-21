package com.koifish.controller;

import com.koifish.domain.entity.Article;
import com.koifish.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hello")
    String hi() {
        return "hello world";
    }

    @GetMapping("/list")
    public List<Article> test() {
        return articleService.list();
    }

}
