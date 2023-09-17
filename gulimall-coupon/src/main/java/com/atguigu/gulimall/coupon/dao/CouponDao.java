package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xjy
 * @email xjy_annabel@hotmail.com
 * @date 2023-08-25 15:49:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
