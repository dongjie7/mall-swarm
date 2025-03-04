package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class UmsRoleResourceRelation implements Serializable {
    private Long id;

    @Schema(title = "角色ID")
    private Long roleId;

    @Schema(title = "资源ID")
    private Long resourceId;

    private static final long serialVersionUID = 1L;
}