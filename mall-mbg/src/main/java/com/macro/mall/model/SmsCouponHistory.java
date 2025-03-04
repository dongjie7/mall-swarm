package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsCouponHistory implements Serializable {
    private Long id;

    private Long couponId;

    private Long memberId;

    private String couponCode;

    @Schema(title = "领取人昵称")
    private String memberNickname;

    @Schema(title = "获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    private Date createTime;

    @Schema(title = "使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    @Schema(title = "使用时间")
    private Date useTime;

    @Schema(title = "订单编号")
    private Long orderId;

    @Schema(title = "订单号码")
    private String orderSn;

    private static final long serialVersionUID = 1L;
}