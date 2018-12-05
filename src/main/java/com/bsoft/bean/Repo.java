package com.bsoft.bean;

import java.util.Date;

import lombok.Data;
/**
 * Repo
 * @description 仓库类
 * @author zk
 * @date 2018年12月5日 下午1:47:55
 * @version 1.0
 */
@Data
public class Repo {
    /**
     * 主键id
     */
    private Short id;
    /**
     * 所属用户id，关联用户表t_user
     */
    private Short userId;
    /**
     * 仓库名称
     */
    private String cReponame;
    /**
     * 仓库简介
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