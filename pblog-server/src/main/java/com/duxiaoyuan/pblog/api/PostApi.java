package com.duxiaoyuan.pblog.api;

import com.duxiaoyuan.pblog.common.Result;
import com.duxiaoyuan.pblog.domain.Tag;
import com.duxiaoyuan.pblog.vo.FocusVo;
import com.duxiaoyuan.pblog.vo.PostListVo;
import com.duxiaoyuan.pblog.vo.PostVo;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface PostApi {

    /**
     * 获取所有博客
     * @return 所有博客列表
     */
    @GetMapping("/list")
    Result<PostListVo> getAllPost();

    /**
     * 获取所有聚焦
     * 上限为三个
     * @return 三个聚焦
     */
    @GetMapping("/focus")
    Result<List<FocusVo>> getFocuses();

    @GetMapping("/category")
    Result<List<Tag>> getAllCategory();
}
