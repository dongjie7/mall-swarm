package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsRole implements Serializable {
    private Long id;

    @Schema(title = "名称")
    private String name;

    @Schema(title = "描述")
    private String description;

    @Schema(title = "后台用户数量")
    private Integer adminCount;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "启用状态：0->禁用；1->启用")
    private Integer status;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}