package com.hawk.mybatis.base;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.hawk.core.base.AbstractBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: BaseServiceImpl
 * @ProjectName spring-boot-learning
 * @Author Hawk
 * @Date 2021/2/1 16:29
 */
public abstract class BaseServiceImpl<T extends BasePO> extends AbstractBaseServiceImpl implements BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    private Class<T> cache = null;

    @Override
    public Long insert(T bean) {
        bean.setId(super.getNextId());
        baseMapper.insert(bean);
        return bean.getId();
    }

    @Override
    public void insertBatch(List<T> paramBeans) {
        for (T item : paramBeans) {
            Long newId = getNextId();
            item.setId(newId);
        }
        baseMapper.insertList(paramBeans);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatchByPrimaryKeys(String ids) {
        List<String> stringList = StrUtil.split(ids, ',');
        List<Long> idLst = stringList.stream().map(c -> Long.parseLong(c)).collect(Collectors.toList());
        deleteBatchByPrimaryKeys(idLst);
    }

    @Override
    public void updateByPrimaryKeySelective(T paramBean) {
        baseMapper.updateByPrimaryKeySelective(paramBean);
    }

    @Override
    public T getByPrimaryKey(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> listByConditions(T paramBean) {
        return baseMapper.select(paramBean);
    }

    @Override
    public List<T> listAll() {
        return baseMapper.selectAll();
    }

    @Override
    public T listOne(T paramBean) {
        return baseMapper.selectOne(paramBean);
    }

    @Override
    public PageInfo listByPage(T paramBean, int pageNum, int pageSize) {
        PageMethod.startPage(pageNum, pageSize);
        List<T> lst = baseMapper.select(paramBean);
        return new PageInfo<>(lst);
    }

    @Override
    public void deleteBatchByPrimaryKeys(List<Long> ids) {
        deleteBatchByPrimaryKeys(ids);
    }

    @Override
    public Class<T> getTypeArguement() {
        if (cache == null){
            cache = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return cache;
    }
}
