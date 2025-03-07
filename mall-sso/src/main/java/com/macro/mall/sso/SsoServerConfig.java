package com.macro.mall.sso;

import cn.dev33.satoken.sso.config.SaSsoServerConfig;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.dtflys.forest.Forest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Classname com.macro.mall.sso.SsoServerConfig.java
 * @author dongjie
 */
@Configuration
@Slf4j
public class SsoServerConfig {
    // 配置SSO相关参数
    @Autowired
    private void configSso(SaSsoServerConfig ssoServer) {
        // 配置：未登录时返回的View
        ssoServer.notLoginView = () -> {
            return new ModelAndView("sa-login.html");
        };
        // 配置：登录处理函数
        ssoServer.doLoginHandle = (name, pwd) -> {
            // 此处仅做模拟登录，真实环境应该查询数据进行登录
            if("sa".equals(name) && "123456".equals(pwd)) {
                StpUtil.login(10001);
                Map<String, Object> userInfo = new HashMap<>();
                userInfo.put("name", "sa");
                userInfo.put("pwd", "123456");
                StpUtil.getSession().set("userInfo", userInfo);
                return SaResult.ok("登录成功！").setData(StpUtil.getTokenValue());
            }
            return SaResult.error("登录失败！");
        };
        // 配置 Http 请求处理器 （在模式三的单点注销功能下用到，如不需要可以注释掉）
        ssoServer.sendHttp = url -> {
            try {
                log.info("------ 发起请求url:{}", url);
                String resStr = Forest.get(url).executeAsString();
                log.info("------ 请求结果：{}", resStr);
                return resStr;
            } catch (Exception e) {
                log.error("http 请求异常 {}", e.getMessage());
                return null;
            }
        };
    }
}
