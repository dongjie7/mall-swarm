package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class OmsOrderReturnApply implements Serializable {
    private Long id;

    @Schema(title = "订单id")
    private Long orderId;

    @Schema(title = "收货地址表id")
    private Long companyAddressId;

    @Schema(title = "退货商品id")
    private Long productId;

    @Schema(title = "订单编号")
    private String orderSn;

    @Schema(title = "申请时间")
    private Date createTime;

    @Schema(title = "会员用户名")
    private String memberUsername;

    @Schema(title = "退款金额")
    private BigDecimal returnAmount;

    @Schema(title = "退货人姓名")
    private String returnName;

    @Schema(title = "退货人电话")
    private String returnPhone;

    @Schema(title = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    @Schema(title = "处理时间")
    private Date handleTime;

    @Schema(title = "商品图片")
    private String productPic;

    @Schema(title = "商品名称")
    private String productName;

    @Schema(title = "商品品牌")
    private String productBrand;

    @Schema(title = "商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    @Schema(title = "退货数量")
    private Integer productCount;

    @Schema(title = "商品单价")
    private BigDecimal productPrice;

    @Schema(title = "商品实际支付单价")
    private BigDecimal productRealPrice;

    @Schema(title = "原因")
    private String reason;

    @Schema(title = "描述")
    private String description;

    @Schema(title = "凭证图片，以逗号隔开")
    private String proofPics;

    @Schema(title = "处理备注")
    private String handleNote;

    @Schema(title = "处理人员")
    private String handleMan;

    @Schema(title = "收货人")
    private String receiveMan;

    @Schema(title = "收货时间")
    private Date receiveTime;

    @Schema(title = "收货备注")
    private String receiveNote;

    private static final long serialVersionUID = 1L;
}