package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotionLog implements Serializable {
    private Integer id;

    private Integer memberId;

    private Long productId;

    private String memberPhone;

    private String productName;

    @Schema(title = "会员订阅时间")
    private Date subscribeTime;

    private Date sendTime;

    private static final long serialVersionUID = 1L;
}