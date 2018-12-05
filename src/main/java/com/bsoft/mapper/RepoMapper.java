package com.bsoft.mapper;

import com.bsoft.bean.Repo;

public interface RepoMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Repo record);

    int insertSelective(Repo record);

    Repo selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Repo record);

    int updateByPrimaryKey(Repo record);
}