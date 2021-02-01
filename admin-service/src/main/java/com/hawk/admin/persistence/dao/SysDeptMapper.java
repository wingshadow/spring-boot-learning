package com.hawk.admin.persistence.dao;




import com.hawk.admin.persistence.entity.SysConfig;
import com.hawk.admin.persistence.entity.SysDept;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysDeptMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 10:55
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {

    List<SysDept> findAllRecursion();

    List<SysDept> findDeptRecursion(Long id);

}
