package com.metazz.metamall.product.dao;

import com.metazz.metamall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-01 18:23:33
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
