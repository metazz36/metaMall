package com.metazz.metamall.member.feign;

import com.metazz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/info/{id}")
    R info(@PathVariable("id") Long id);

}
