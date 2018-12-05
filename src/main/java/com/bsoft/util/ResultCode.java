package com.bsoft.util;


/**
 * 
 * ResultCode
 * @description Result的code值
 * @author zk
 * @date 2018年12月3日 下午3:34:09
 * @version 1.0
 */
public enum ResultCode {

	/**
	 * 数据验证相关错误编码
	 */
	DataErrorCode(-100),
	
	/**
	 * 系统错误相关编码
	 */
	SysErrorCode(-500),
	
	/**
	 * 请求错误相关错误编码
	 */
	ReqErrorCode(-400);
	
	private Integer code;
	
	private ResultCode(Integer code){
		this.code = code;
	}
	
	public Integer getCode(){
		return this.code;
	}
	
}
