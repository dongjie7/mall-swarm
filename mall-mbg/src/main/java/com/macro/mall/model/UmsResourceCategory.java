package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsResourceCategory implements Serializable {
    private Long id;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "分类名称")
    private String name;

    @Schema(title = "排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}