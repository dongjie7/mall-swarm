package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class SmsFlashPromotion implements Serializable {
    private Long id;

    @Schema(title = "秒杀时间段名称")
    private String title;

    @Schema(title = "开始日期")
    private Date startDate;

    @Schema(title = "结束日期")
    private Date endDate;

    @Schema(title = "上下线状态")
    private Integer status;

    @Schema(title = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}