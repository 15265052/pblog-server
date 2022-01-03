package com.duxiaoyuan.pblog.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * table for all the posts
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Integer id;

    private Boolean isHot;

    private Boolean isTop;

    private String bannerAddress;

    private String title;

    private Date uploadTime;

    private String summary;

    private Integer viewsNum;

    private Integer commentNum;

    private Boolean isFocus;

    private Integer tagId;
}