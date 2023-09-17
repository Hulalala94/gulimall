package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xjy
 * @email xjy_annabel@hotmail.com
 * @date 2023-08-28 12:52:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
