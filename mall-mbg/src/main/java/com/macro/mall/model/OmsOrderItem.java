package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class OmsOrderItem implements Serializable {
    private Long id;

    @Schema(title = "订单id")
    private Long orderId;

    @Schema(title = "订单编号")
    private String orderSn;

    private Long productId;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productSn;

    @Schema(title = "销售价格")
    private BigDecimal productPrice;

    @Schema(title = "购买数量")
    private Integer productQuantity;

    @Schema(title = "商品sku编号")
    private Long productSkuId;

    @Schema(title = "商品sku条码")
    private String productSkuCode;

    @Schema(title = "商品分类id")
    private Long productCategoryId;

    @Schema(title = "商品促销名称")
    private String promotionName;

    @Schema(title = "商品促销分解金额")
    private BigDecimal promotionAmount;

    @Schema(title = "优惠券优惠分解金额")
    private BigDecimal couponAmount;

    @Schema(title = "积分优惠分解金额")
    private BigDecimal integrationAmount;

    @Schema(title = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;

    @Schema(title = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}