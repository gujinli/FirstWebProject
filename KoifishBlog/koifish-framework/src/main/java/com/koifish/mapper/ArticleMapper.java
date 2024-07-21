package com.koifish.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.koifish.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
