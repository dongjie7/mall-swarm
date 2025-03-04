package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class PmsSkuStock implements Serializable {
    private Long id;

    private Long productId;

    @Schema(title = "sku编码")
    private String skuCode;

    private BigDecimal price;

    @Schema(title = "库存")
    private Integer stock;

    @Schema(title = "预警库存")
    private Integer lowStock;

    @Schema(title = "展示图片")
    private String pic;

    @Schema(title = "销量")
    private Integer sale;

    @Schema(title = "单品促销价格")
    private BigDecimal promotionPrice;

    @Schema(title = "锁定库存")
    private Integer lockStock;

    @Schema(title = "商品销售属性，json格式")
    private String spData;

    private static final long serialVersionUID = 1L;
}