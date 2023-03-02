package com.metazz.metamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-01 18:23:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

