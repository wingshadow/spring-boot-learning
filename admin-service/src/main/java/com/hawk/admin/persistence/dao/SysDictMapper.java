package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysDict;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysDictMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/26 20:55
 */
@Mapper
public interface SysDictMapper extends BaseMapper<SysDict> {

}
