package com.metazz.metamall.order.dao;

import com.metazz.metamall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
