package com.duxiaoyuan.pblog.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author duxiaoyuan
 */
@Data
@Builder
public class PostListVo {
    private Integer postCount;

    private List<PostVo> posts;

    private Integer curPage;

    private Boolean hasNextPage;
}
