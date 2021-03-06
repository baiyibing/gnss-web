package com.gnss.web.terminal.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>Description: 多媒体文件查询条件</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2020/6/29
 */
@ApiModel("多媒体文件查询条件")
@Data
public class MediaFileSearchDTO {

    @ApiModelProperty(value = "名称", position = 1)
    private String nameLike;
}