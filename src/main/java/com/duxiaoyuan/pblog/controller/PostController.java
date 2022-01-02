package com.duxiaoyuan.pblog.controller;

import cn.hutool.core.bean.BeanUtil;
import com.duxiaoyuan.pblog.api.PostApi;
import com.duxiaoyuan.pblog.common.Result;
import com.duxiaoyuan.pblog.domain.Post;
import com.duxiaoyuan.pblog.domain.Tag;
import com.duxiaoyuan.pblog.model.PostResult;
import com.duxiaoyuan.pblog.service.PostService;
import com.duxiaoyuan.pblog.util.DateUtil;
import com.duxiaoyuan.pblog.vo.FocusVo;
import com.duxiaoyuan.pblog.vo.PostListVo;
import com.duxiaoyuan.pblog.vo.PostVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author duxiaoyuan
 */
@Slf4j
@RestController
@RequestMapping("/api/post")
public class PostController implements PostApi {
    private final PostService postService;

    public PostController(@Autowired PostService postService) {
        this.postService = postService;
    }

    @Override
    public Result<PostListVo> getAllPost() {
        List<PostResult> postList = postService.getAllPost();
        log.info(postList.toString());
        PostListVo postListVo = PostListVo.builder()
                .postCount(postList.size())
                .curPage(1)
                .hasNextPage(false)
                .posts(postList.stream()
                        .map(o -> {
                            String uploadTime = DateUtil.formatDate(o.getUploadTime(), "yyyy-MM-dd");
                            String tagName = o.getTag().getTagName();
                            PostVo p = BeanUtil.toBean(o, PostVo.class);
                            p.setUploadTime(uploadTime);
                            p.setTag(tagName);
                            return p;
                        })
                        .collect(Collectors.toList()))
                .build();

        return Result.success(postListVo);

    }

    @Override
    public Result<List<FocusVo>> getFocuses(){
        List<Post> focuses = postService.getFocuses();
        List<FocusVo> ret = focuses.stream().map(o -> BeanUtil.toBean(o, FocusVo.class)).collect(Collectors.toList());
        log.info(ret.toString());
        return Result.success(ret);
    }

}
