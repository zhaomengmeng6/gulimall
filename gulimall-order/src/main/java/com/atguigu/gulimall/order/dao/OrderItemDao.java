package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author qzhao
 * @email zhameng6@163.com
 * @date 2024-11-17 21:54:26
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
