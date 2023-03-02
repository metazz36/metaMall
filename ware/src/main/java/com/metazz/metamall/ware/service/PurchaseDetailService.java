package com.metazz.metamall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-02 09:28:13
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

