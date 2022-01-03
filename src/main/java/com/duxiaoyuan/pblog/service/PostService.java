package com.duxiaoyuan.pblog.service;

import com.duxiaoyuan.pblog.domain.Tag;
import com.duxiaoyuan.pblog.mapper.PostExtMapper;
import com.duxiaoyuan.pblog.mapper.PostMapper;
import com.duxiaoyuan.pblog.domain.Post;
import com.duxiaoyuan.pblog.mapper.TagMapper;
import com.duxiaoyuan.pblog.model.PostResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author duxiaoyuan
 */
@Service
public class PostService {
    private final PostMapper postMapper;
    private final PostExtMapper postExtMapper;
    private final TagMapper tagMapper;

    public PostService(@Autowired PostMapper postMapper, @Autowired PostExtMapper postExtMapper, @Autowired TagMapper tagMapper) {
        this.postMapper = postMapper;
        this.postExtMapper = postExtMapper;
        this.tagMapper = tagMapper;
    }

    public List<PostResult> getAllPost() {
        return postExtMapper.selectAll();
    }

    public List<Post> getFocuses() {
        return postExtMapper.selectFocus();
    }

    public List<Tag> getAllCategory() {
        return tagMapper.selectAll();
    }
}
