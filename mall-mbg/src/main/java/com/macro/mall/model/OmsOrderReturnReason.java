package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class OmsOrderReturnReason implements Serializable {
    private Long id;

    @Schema(title = "退货类型")
    private String name;

    private Integer sort;

    @Schema(title = "状态：0->不启用；1->启用")
    private Integer status;

    @Schema(title = "添加时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}