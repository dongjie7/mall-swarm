package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsProductVertifyRecord implements Serializable {
    private Long id;

    private Long productId;

    private Date createTime;

    @Schema(title = "审核人")
    private String vertifyMan;

    private Integer status;

    @Schema(title = "反馈详情")
    private String detail;

    private static final long serialVersionUID = 1L;
}