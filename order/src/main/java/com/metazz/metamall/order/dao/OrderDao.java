package com.metazz.metamall.order.dao;

import com.metazz.metamall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
