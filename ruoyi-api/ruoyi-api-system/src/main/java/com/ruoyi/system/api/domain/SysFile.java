package com.ruoyi.system.api.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文件信息
 *
 * @author ruoyi
 */
@Getter
@Setter
@ToString
public class SysFile {
    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件地址
     */
    private String url;
}
