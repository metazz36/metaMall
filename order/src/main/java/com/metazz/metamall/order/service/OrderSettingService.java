package com.metazz.metamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:34
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

