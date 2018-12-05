package com.bsoft.util;

import java.util.HashMap;
/**
 * 
 * Result
 * @description 返回前台的结果类
 * @author zk
 * @date 2018年12月3日 下午3:31:23
 * @version 1.0
 */
public class Result extends HashMap<String, Object>{

    private static final long serialVersionUID = -2895870033689272392L;
    
    /**结果提示信息取值字符*/
    public static final String msg = "msg";
    
    /**结果编码取值字符--详情见ResultDic*/
    public static final String code = "code";
    
    /**结果附带数据取值字符*/
    public static final String data = "data";
    
}
