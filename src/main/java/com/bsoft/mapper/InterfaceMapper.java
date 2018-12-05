package com.bsoft.mapper;

import com.bsoft.bean.Interface;

public interface InterfaceMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Interface record);

    int insertSelective(Interface record);

    Interface selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}