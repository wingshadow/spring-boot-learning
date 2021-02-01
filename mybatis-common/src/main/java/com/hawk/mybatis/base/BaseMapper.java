package com.hawk.mybatis.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <pre>
 * Mapper类通用接口，可实现简单的增删改查功能
 * 还可以使用MyBatis-Plug   https://mp.baomidou.com/guide/#特性
 * </pre>
 * @see Mapper
 * @see MySqlMapper
 * @author XuXy
 * @create 2018年1月12日 下午1:47:23
 *
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
