package com.macro.mall.sso;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.dev33.satoken.util.SaResult;

/**
 * 全局异常处理 
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	// 全局异常拦截
	@ExceptionHandler
	public SaResult handlerException(Exception e) {
		return SaResult.error(e.getMessage());
	}
}
