package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMember implements Serializable {
    private Long id;

    private Long memberLevelId;

    @Schema(title = "用户名")
    private String username;

    @Schema(title = "密码")
    private String password;

    @Schema(title = "昵称")
    private String nickname;

    @Schema(title = "手机号码")
    private String phone;

    @Schema(title = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @Schema(title = "注册时间")
    private Date createTime;

    @Schema(title = "头像")
    private String icon;

    @Schema(title = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @Schema(title = "生日")
    private Date birthday;

    @Schema(title = "所做城市")
    private String city;

    @Schema(title = "职业")
    private String job;

    @Schema(title = "个性签名")
    private String personalizedSignature;

    @Schema(title = "用户来源")
    private Integer sourceType;

    @Schema(title = "积分")
    private Integer integration;

    @Schema(title = "成长值")
    private Integer growth;

    @Schema(title = "剩余抽奖次数")
    private Integer luckeyCount;

    @Schema(title = "历史积分数量")
    private Integer historyIntegration;

    private static final long serialVersionUID = 1L;
}