package com.metazz.metamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:33
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

