package com.bsoft.bean;

import java.util.Date;

import lombok.Data;

/**
 * Interface
 * @description 接口类
 * @author zk
 * @date 2018年12月5日 下午1:52:47
 * @version 1.0
 */
@Data
public class Interface {
    /**
     * 主键id
     */
    private Short id;
    /**
     * 所属模块id，关联模块类
     */
    private Short modelId;
    /**
     * 接口名称
     */
    private String cInterfacename;
    /**
     * 接口地址
     */
    private String cUrl;
    /**
     * 接口类型
     */
    private String cInterfacetype;
    /**
     * 请求方式
     */
    private String cRequesttype;
    /**
     * 参数类型
     */
    private String cParamtype;
    /**
     * 简介
     */
    private String cDescription;
    /**
     * 创建时间
     */
    private Date dCreatetime;
    /**
     * 最后修改时间
     */
    private Date dUpdatetime;
}