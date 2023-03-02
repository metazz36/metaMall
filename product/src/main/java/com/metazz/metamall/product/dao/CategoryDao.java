package com.metazz.metamall.product.dao;

import com.metazz.metamall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-01 18:23:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
