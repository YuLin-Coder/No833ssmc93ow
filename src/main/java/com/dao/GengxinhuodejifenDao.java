package com.dao;

import com.entity.GengxinhuodejifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GengxinhuodejifenVO;
import com.entity.view.GengxinhuodejifenView;


/**
 * 更新获得积分
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface GengxinhuodejifenDao extends BaseMapper<GengxinhuodejifenEntity> {
	
	List<GengxinhuodejifenVO> selectListVO(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
	
	GengxinhuodejifenVO selectVO(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
	
	List<GengxinhuodejifenView> selectListView(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);

	List<GengxinhuodejifenView> selectListView(Pagination page,@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
	
	GengxinhuodejifenView selectView(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
	
}
