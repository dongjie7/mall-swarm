package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsComment implements Serializable {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    @Schema(title = "评价星数：0->5")
    private Integer star;

    @Schema(title = "评价的ip")
    private String memberIp;

    private Date createTime;

    private Integer showStatus;

    @Schema(title = "购买时的商品属性")
    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    @Schema(title = "上传图片地址，以逗号隔开")
    private String pics;

    @Schema(title = "评论用户头像")
    private String memberIcon;

    private Integer replayCount;

    private String content;

    private static final long serialVersionUID = 1L;
}