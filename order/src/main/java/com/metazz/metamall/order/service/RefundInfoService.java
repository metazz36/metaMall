package com.metazz.metamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-02-28 15:33:33
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

