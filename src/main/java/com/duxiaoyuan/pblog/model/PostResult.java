package com.duxiaoyuan.pblog.model;

import com.duxiaoyuan.pblog.domain.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author duxiaoyuan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostResult {
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

    private Tag tag;
}
