package com.metazz.metamall.member.dao;

import com.metazz.metamall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-02 10:16:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
