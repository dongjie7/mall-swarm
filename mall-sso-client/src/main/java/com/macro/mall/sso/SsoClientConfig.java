package com.macro.mall.sso;

import cn.dev33.satoken.sso.config.SaSsoClientConfig;
import cn.dev33.satoken.util.SaResult;
import com.dtflys.forest.Forest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Classname com.macro.mall.sso.SsoClientConfig.java
 * @author dongjie
 */
@Configuration
@Slf4j
public class SsoClientConfig {
    // 配置SSO相关参数
    @Autowired
    private void configSso(SaSsoClientConfig ssoClient) {
        // 配置Http请求处理器
        ssoClient.sendHttp = url -> {
            log.info("------ 发起请求：{}", url);
            String resStr = Forest.get(url).executeAsString();
            log.info("------ 请求结果：{}", resStr);
            return resStr;
        };
    }
}
