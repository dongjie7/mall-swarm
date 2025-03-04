package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class UmsRolePermissionRelation implements Serializable {
    private Long id;

    private Long roleId;

    private Long permissionId;

    private static final long serialVersionUID = 1L;
}