package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zsf
 * @email 2460262466@gmail.com
 * @date 2022-11-21 18:02:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
