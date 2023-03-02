package com.metazz.metamall.coupon.dao;

import com.metazz.metamall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-02 10:03:32
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
