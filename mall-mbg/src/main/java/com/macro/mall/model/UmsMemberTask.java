package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    @Schema(title = "赠送成长值")
    private Integer growth;

    @Schema(title = "赠送积分")
    private Integer intergration;

    @Schema(title = "任务类型：0->新手任务；1->日常任务")
    private Integer type;

    private static final long serialVersionUID = 1L;
}