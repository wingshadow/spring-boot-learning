package com.hawk.mybatis.base;

import com.hawk.common.base.BaseBean;
import lombok.Data;

import javax.persistence.Id;

/**
 * @Title: BasePO
 * @ProjectName spring-boot-learning
 * @Author Hawk
 * @Date 2021/2/1 16:31
 */
@Data
public class BasePO extends BaseBean {
    @Id
    private Long id;
}
