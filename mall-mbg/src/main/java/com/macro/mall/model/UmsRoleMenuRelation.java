package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class UmsRoleMenuRelation implements Serializable {
    private Long id;

    @Schema(title = "角色ID")
    private Long roleId;

    @Schema(title = "菜单ID")
    private Long menuId;

    private static final long serialVersionUID = 1L;
}