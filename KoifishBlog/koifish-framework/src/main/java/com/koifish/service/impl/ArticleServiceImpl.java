package com.koifish.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.koifish.domain.entity.Article;
import com.koifish.mapper.ArticleMapper;
import com.koifish.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
