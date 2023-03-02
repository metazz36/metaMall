package com.metazz.metamall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.metazz.common.utils.PageUtils;
import com.metazz.metamall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author metazz
 * @email 772150928@qq.com
 * @date 2023-03-02 10:16:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

