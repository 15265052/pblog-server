package com.duxiaoyuan.pblog.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author duxiaoyuan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostVo {
    private Integer id;

    private Boolean isTop;

    private Boolean isHot;

    private String uploadTime;

    private String title;

    private String summary;

    private String tag;

    private Integer viewsNum;

    private Integer commentNum;

    private String bannerAddress;
}
