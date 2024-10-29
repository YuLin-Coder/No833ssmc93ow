package com.dao;

import com.entity.XiaofeijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeijiluVO;
import com.entity.view.XiaofeijiluView;


/**
 * 消费记录
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface XiaofeijiluDao extends BaseMapper<XiaofeijiluEntity> {
	
	List<XiaofeijiluVO> selectListVO(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
	
	XiaofeijiluVO selectVO(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
	
	List<XiaofeijiluView> selectListView(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);

	List<XiaofeijiluView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
	
	XiaofeijiluView selectView(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
	
}
