package com.hawk.admin.persistence.dao;

import com.hawk.admin.persistence.entity.SysMenu;
import com.hawk.admin.persistence.entity.SysRoleMenu;
import com.hawk.mybatis.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SysRoleMenuMapper
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 15:41
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    void deleteByRoleId(Long id);

    void deleteBatchByRoleIds(List<Long> list);
}
