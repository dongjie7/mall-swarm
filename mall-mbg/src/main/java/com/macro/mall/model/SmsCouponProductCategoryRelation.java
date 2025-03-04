package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    @Schema(title = "产品分类名称")
    private String productCategoryName;

    @Schema(title = "父分类名称")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;
}