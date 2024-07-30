package com.koifish.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.koifish.domain.ResponseResult;
import com.koifish.domain.entity.Article;
import com.koifish.mapper.ArticleMapper;
import com.koifish.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    /**
     * 查询热门文章
     * @return ResponseResult
     */
    @Override
    public ResponseResult findHotArticleList() {
        // 查询热门文章，
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        // 必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);
        // 按照浏览量进行排序
        queryWrapper.orderByAsc(Article::getViewCount);
        // 最多只查询10条, current: 当前
        Page<Article> page = new Page(1, 10);
        page(page, queryWrapper);

        List<Article> articles = page.getRecords();

        return ResponseResult.okResult(articles);
    }
}
