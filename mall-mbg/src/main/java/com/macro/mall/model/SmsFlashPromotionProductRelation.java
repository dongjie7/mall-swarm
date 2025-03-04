package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class SmsFlashPromotionProductRelation implements Serializable {
    @Schema(title = "编号")
    private Long id;

    private Long flashPromotionId;

    @Schema(title = "编号")
    private Long flashPromotionSessionId;

    private Long productId;

    @Schema(title = "限时购价格")
    private BigDecimal flashPromotionPrice;

    @Schema(title = "限时购数量")
    private Integer flashPromotionCount;

    @Schema(title = "每人限购数量")
    private Integer flashPromotionLimit;

    @Schema(title = "排序")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}