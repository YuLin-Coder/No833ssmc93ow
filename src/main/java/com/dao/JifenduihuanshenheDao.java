package com.dao;

import com.entity.JifenduihuanshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenduihuanshenheVO;
import com.entity.view.JifenduihuanshenheView;


/**
 * 积分兑换审核
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface JifenduihuanshenheDao extends BaseMapper<JifenduihuanshenheEntity> {
	
	List<JifenduihuanshenheVO> selectListVO(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
	
	JifenduihuanshenheVO selectVO(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
	
	List<JifenduihuanshenheView> selectListView(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);

	List<JifenduihuanshenheView> selectListView(Pagination page,@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
	
	JifenduihuanshenheView selectView(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
	
}
