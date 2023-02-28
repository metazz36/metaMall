package com.metazz.metamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:34
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

