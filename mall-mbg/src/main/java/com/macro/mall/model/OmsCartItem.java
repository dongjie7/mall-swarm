package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OmsCartItem implements Serializable {
    private Long id;

    private Long productId;

    private Long productSkuId;

    private Long memberId;

    @Schema(title = "购买数量")
    private Integer quantity;

    @Schema(title = "添加到购物车的价格")
    private BigDecimal price;

    @Schema(title = "商品主图")
    private String productPic;

    @Schema(title = "商品名称")
    private String productName;

    @Schema(title = "商品副标题（卖点）")
    private String productSubTitle;

    @Schema(title = "商品sku条码")
    private String productSkuCode;

    @Schema(title = "会员昵称")
    private String memberNickname;

    @Schema(title = "创建时间")
    private Date createDate;

    @Schema(title = "修改时间")
    private Date modifyDate;

    @Schema(title = "是否删除")
    private Integer deleteStatus;

    @Schema(title = "商品分类")
    private Long productCategoryId;

    private String productBrand;

    private String productSn;

    @Schema(title = "商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    private static final long serialVersionUID = 1L;
}