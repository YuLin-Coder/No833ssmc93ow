package com.dao;

import com.entity.DianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingVO;
import com.entity.view.DianyingView;


/**
 * 电影
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface DianyingDao extends BaseMapper<DianyingEntity> {
	
	List<DianyingVO> selectListVO(@Param("ew") Wrapper<DianyingEntity> wrapper);
	
	DianyingVO selectVO(@Param("ew") Wrapper<DianyingEntity> wrapper);
	
	List<DianyingView> selectListView(@Param("ew") Wrapper<DianyingEntity> wrapper);

	List<DianyingView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingEntity> wrapper);
	
	DianyingView selectView(@Param("ew") Wrapper<DianyingEntity> wrapper);
	
}
