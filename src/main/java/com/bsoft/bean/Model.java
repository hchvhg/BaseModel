package com.bsoft.bean;

import java.util.Date;

import lombok.Data;
/**
 * Model
 * @description 模块类
 * @author zk
 * @date 2018年12月5日 下午1:50:23
 * @version 1.0
 */
@Data
public class Model {
    /**
     * 主键id
     */
    private Short id;
    /**
     * 所属仓库id，关联仓库表t_repo
     */
    private Short repoId;
    /**
     * 模块名称
     */
    private String cModelname;
    /**
     * 模块简介
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