package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    @Schema(title = "会员价格")
    private BigDecimal memberPrice;

    private String memberLevelName;

    private static final long serialVersionUID = 1L;
}