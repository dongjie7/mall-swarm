package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsAdmin implements Serializable {
    private Long id;

    private String username;

    private String password;

    @Schema(title = "头像")
    private String icon;

    @Schema(title = "邮箱")
    private String email;

    @Schema(title = "昵称")
    private String nickName;

    @Schema(title = "备注信息")
    private String note;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "最后登录时间")
    private Date loginTime;

    @Schema(title = "帐号启用状态：0->禁用；1->启用")
    private Integer status;

    private static final long serialVersionUID = 1L;
}