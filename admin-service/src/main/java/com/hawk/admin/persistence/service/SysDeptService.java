package com.hawk.admin.persistence.service;

import com.github.pagehelper.PageInfo;
import com.hawk.admin.persistence.entity.SysDept;
import com.hawk.mybatis.base.BaseService;

import java.util.List;

/**
 * @Title: SysDeptService
 * @ProjectName spring-safety-training
 * @Author May
 * @Date 2020/3/27 14:35
 */
public interface SysDeptService extends BaseService<SysDept> {


    /**
     * 查询所有部门及子部门的信息
     * @return
     */
    List<SysDept> findAllRecursion();

    /**
     * 查询下属部门及其子部门信息
     * @param parentId
     * @return
     */
    List<SysDept> findDeptRecursion(Long parentId);
}
