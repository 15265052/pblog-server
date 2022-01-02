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
public class FocusVo {

    private Integer id;

    private String title;

    private String bannerAddress;
}
