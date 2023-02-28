package com.metazz.metamall.order.dao;

import com.metazz.metamall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:34
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
