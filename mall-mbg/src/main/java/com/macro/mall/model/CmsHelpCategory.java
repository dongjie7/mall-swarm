package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class CmsHelpCategory implements Serializable {
    private Long id;

    private String name;

    @Schema(title = "分类图标")
    private String icon;

    @Schema(title = "专题数量")
    private Integer helpCount;

    private Integer showStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}