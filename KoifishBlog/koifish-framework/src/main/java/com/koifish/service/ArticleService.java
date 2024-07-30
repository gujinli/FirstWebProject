package com.koifish.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.koifish.domain.ResponseResult;
import com.koifish.domain.entity.Article;

public interface ArticleService extends IService<Article> {

    ResponseResult findHotArticleList();
}
