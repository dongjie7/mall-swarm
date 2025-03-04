package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class SmsCoupon implements Serializable {
    private Long id;

    @Schema(title = "优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    private String name;

    @Schema(title = "使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    @Schema(title = "数量")
    private Integer count;

    @Schema(title = "金额")
    private BigDecimal amount;

    @Schema(title = "每人限领张数")
    private Integer perLimit;

    @Schema(title = "使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    private Date startTime;

    private Date endTime;

    @Schema(title = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    @Schema(title = "备注")
    private String note;

    @Schema(title = "发行数量")
    private Integer publishCount;

    @Schema(title = "已使用数量")
    private Integer useCount;

    @Schema(title = "领取数量")
    private Integer receiveCount;

    @Schema(title = "可以领取的日期")
    private Date enableTime;

    @Schema(title = "优惠码")
    private String code;

    @Schema(title = "可领取的会员类型：0->无限时")
    private Integer memberLevel;

    private static final long serialVersionUID = 1L;
}