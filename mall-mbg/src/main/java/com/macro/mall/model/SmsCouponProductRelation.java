package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productId;

    @Schema(title = "商品名称")
    private String productName;

    @Schema(title = "商品编码")
    private String productSn;

    private static final long serialVersionUID = 1L;
}