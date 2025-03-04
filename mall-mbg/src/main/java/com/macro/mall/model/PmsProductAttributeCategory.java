package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    @Schema(title = "属性数量")
    private Integer attributeCount;

    @Schema(title = "参数数量")
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}