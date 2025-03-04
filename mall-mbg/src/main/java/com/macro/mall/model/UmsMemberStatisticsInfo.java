package com.macro.mall.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class UmsMemberStatisticsInfo implements Serializable {
    private Long id;

    private Long memberId;

    @Schema(title = "累计消费金额")
    private BigDecimal consumeAmount;

    @Schema(title = "订单数量")
    private Integer orderCount;

    @Schema(title = "优惠券数量")
    private Integer couponCount;

    @Schema(title = "评价数")
    private Integer commentCount;

    @Schema(title = "退货数量")
    private Integer returnOrderCount;

    @Schema(title = "登录次数")
    private Integer loginCount;

    @Schema(title = "关注数量")
    private Integer attendCount;

    @Schema(title = "粉丝数量")
    private Integer fansCount;

    private Integer collectProductCount;

    private Integer collectSubjectCount;

    private Integer collectTopicCount;

    private Integer collectCommentCount;

    private Integer inviteFriendCount;

    @Schema(title = "最后一次下订单时间")
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;
}