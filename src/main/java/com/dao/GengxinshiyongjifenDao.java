package com.dao;

import com.entity.GengxinshiyongjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GengxinshiyongjifenVO;
import com.entity.view.GengxinshiyongjifenView;


/**
 * 更新使用积分
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface GengxinshiyongjifenDao extends BaseMapper<GengxinshiyongjifenEntity> {
	
	List<GengxinshiyongjifenVO> selectListVO(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
	
	GengxinshiyongjifenVO selectVO(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
	
	List<GengxinshiyongjifenView> selectListView(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);

	List<GengxinshiyongjifenView> selectListView(Pagination page,@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
	
	GengxinshiyongjifenView selectView(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
	
}
