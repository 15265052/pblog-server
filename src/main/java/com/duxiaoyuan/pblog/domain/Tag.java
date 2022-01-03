package com.duxiaoyuan.pblog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * post tags
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    private Integer id;

    private String tagName;
}