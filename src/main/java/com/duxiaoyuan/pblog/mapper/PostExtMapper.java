package com.duxiaoyuan.pblog.mapper;

import com.duxiaoyuan.pblog.domain.Post;
import com.duxiaoyuan.pblog.model.PostResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostExtMapper {

    List<PostResult> selectAll();

    List<Post> selectFocus();
}