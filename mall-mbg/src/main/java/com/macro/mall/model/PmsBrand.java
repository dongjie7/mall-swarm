package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Data;

@Data
public class PmsBrand implements Serializable {
    private Long id;

    private String name;

    @Schema(title = "首字母")
    private String firstLetter;

    private Integer sort;

    @Schema(title = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    private Integer showStatus;

    @Schema(title = "产品数量")
    private Integer productCount;

    @Schema(title = "产品评论数量")
    private Integer productCommentCount;

    @Schema(title = "品牌logo")
    private String logo;

    @Schema(title = "专区大图")
    private String bigPic;

    @Schema(title = "品牌故事")
    private String brandStory;

    private static final long serialVersionUID = 1L;
}