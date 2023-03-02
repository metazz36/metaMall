package com.metazz.metamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-01 18:23:34
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

