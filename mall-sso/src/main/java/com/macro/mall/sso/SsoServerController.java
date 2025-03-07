package com.macro.mall.sso;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.sign.SaSignUtil;
import cn.dev33.satoken.sso.config.SaSsoServerConfig;
import cn.dev33.satoken.sso.processor.SaSsoServerProcessor;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.dtflys.forest.Forest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class SsoServerController {
	/**
	 * SSO-Server端：处理所有SSO相关请求 
	 * 		http://{host}:{port}/sso/auth			-- 单点登录授权地址，接受参数：redirect=授权重定向地址 
	 * 		http://{host}:{port}/sso/doLogin		-- 账号密码登录接口，接受参数：name、pwd 
	 * 		http://{host}:{port}/sso/checkTicket	-- Ticket校验接口（isHttp=true时打开），接受参数：ticket=ticket码、ssoLogoutCall=单点注销回调地址 [可选] 
	 * 		http://{host}:{port}/sso/signout		-- 单点注销地址（isSlo=true时打开），接受参数：loginId=账号id、sign=参数签名
	 */
	@RequestMapping("/sso/*")
	public Object ssoRequest() {
		return SaSsoServerProcessor.instance.dister();
	}
	// 示例：获取数据接口（用于在模式三下，为 client 端开放拉取数据的接口）
	@RequestMapping("/sso/getData")
	public SaResult getData(String apiType, String loginId) {
		log.info("---获取数据 ---, apiType:{}, loginId:{}", apiType, loginId);
		//校验签名：只有拥有正确秘钥发起的请求才能通过校验
		SaSignUtil.checkRequest(SaHolder.getRequest());
		/**
		 * 不同 client不同秘钥
		 * String client = SaHolder.getRequest().getHeader("client");
		 * SaSsoServerProcessor.instance.ssoServerTemplate.getSignTemplate(client).checkRequest(SaHolder.getRequest());
		 */
		// 自定义返回结果（模拟）
		return SaResult.ok()
			.set("id", loginId)
			.set("name", "LinXiaoYu")
			.set("sex", "女")
			.set("age", 18);
	}
}
