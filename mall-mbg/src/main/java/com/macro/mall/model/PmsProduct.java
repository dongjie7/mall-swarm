package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class PmsProduct implements Serializable {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long feightTemplateId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    @Schema(title = "货号")
    private String productSn;

    @Schema(title = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @Schema(title = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    @Schema(title = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    @Schema(title = "推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    @Schema(title = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    @Schema(title = "排序")
    private Integer sort;

    @Schema(title = "销量")
    private Integer sale;

    private BigDecimal price;

    @Schema(title = "促销价格")
    private BigDecimal promotionPrice;

    @Schema(title = "赠送的成长值")
    private Integer giftGrowth;

    @Schema(title = "赠送的积分")
    private Integer giftPoint;

    @Schema(title = "限制使用的积分数")
    private Integer usePointLimit;

    @Schema(title = "副标题")
    private String subTitle;

    @Schema(title = "市场价")
    private BigDecimal originalPrice;

    @Schema(title = "库存")
    private Integer stock;

    @Schema(title = "库存预警值")
    private Integer lowStock;

    @Schema(title = "单位")
    private String unit;

    @Schema(title = "商品重量，默认为克")
    private BigDecimal weight;

    @Schema(title = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    @Schema(title = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    private String keywords;

    private String note;

    @Schema(title = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    private String detailTitle;

    @Schema(title = "促销开始时间")
    private Date promotionStartTime;

    @Schema(title = "促销结束时间")
    private Date promotionEndTime;

    @Schema(title = "活动限购数量")
    private Integer promotionPerLimit;

    @Schema(title = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    @Schema(title = "品牌名称")
    private String brandName;

    @Schema(title = "商品分类名称")
    private String productCategoryName;

    @Schema(title = "商品描述")
    private String description;

    private String detailDesc;

    @Schema(title = "产品详情网页内容")
    private String detailHtml;

    @Schema(title = "移动端网页详情")
    private String detailMobileHtml;

    private static final long serialVersionUID = 1L;
}