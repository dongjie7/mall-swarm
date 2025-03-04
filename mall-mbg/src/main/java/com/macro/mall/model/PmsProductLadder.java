package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsProductLadder implements Serializable {
    private Long id;

    private Long productId;

    @Schema(title = "满足的商品数量")
    private Integer count;

    @Schema(title = "折扣")
    private BigDecimal discount;

    @Schema(title = "折后价格")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}