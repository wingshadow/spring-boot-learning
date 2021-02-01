package com.hawk.admin.persistence.dao;


import com.hawk.admin.persistence.entity.SysConfig;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysConfigMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 10:47
 */
@Mapper
public interface SysConfigMapper extends BaseMapper<SysConfig> {

}
