package com.dao;

import com.entity.JifenduihuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenduihuanVO;
import com.entity.view.JifenduihuanView;


/**
 * 积分兑换
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface JifenduihuanDao extends BaseMapper<JifenduihuanEntity> {
	
	List<JifenduihuanVO> selectListVO(@Param("ew") Wrapper<JifenduihuanEntity> wrapper);
	
	JifenduihuanVO selectVO(@Param("ew") Wrapper<JifenduihuanEntity> wrapper);
	
	List<JifenduihuanView> selectListView(@Param("ew") Wrapper<JifenduihuanEntity> wrapper);

	List<JifenduihuanView> selectListView(Pagination page,@Param("ew") Wrapper<JifenduihuanEntity> wrapper);
	
	JifenduihuanView selectView(@Param("ew") Wrapper<JifenduihuanEntity> wrapper);
	
}
