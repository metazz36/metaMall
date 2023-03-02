package com.metazz.metamall.coupon.dao;

import com.metazz.metamall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-02 10:03:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
