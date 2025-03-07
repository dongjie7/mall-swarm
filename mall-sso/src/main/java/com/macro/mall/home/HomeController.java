package com.macro.mall.home;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SSO 平台中心模式示例，跳连接进入子系统
 */
@RestController
public class HomeController {
    // 平台化首页
    @RequestMapping("/home")
    public Object index() {
        // 如果未登录，则先去登录
        if(!StpUtil.isLogin()) {
            return SaHolder.getResponse().redirect("/sso/auth");
        }
        // 拼接各个子系统的地址，格式形如：/sso/auth?redirect=${子系统首页}/sso/login?back=${子系统首页}
        String link1 = "/sso/login?back=http://localhost:8201/";
        // 组织网页结构返回到前端
        String title = "<h2>SSO 平台首页</h2>";
        String client1 = "<p><a href='" + link1 + "' target='_blank'> 进入后台管理系统 </a></p>";
        return title + client1;
    }
}
