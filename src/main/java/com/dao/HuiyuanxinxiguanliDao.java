package com.dao;

import com.entity.HuiyuanxinxiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanxinxiguanliVO;
import com.entity.view.HuiyuanxinxiguanliView;


/**
 * 会员信息管理
 * 
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface HuiyuanxinxiguanliDao extends BaseMapper<HuiyuanxinxiguanliEntity> {
	
	List<HuiyuanxinxiguanliVO> selectListVO(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
	
	HuiyuanxinxiguanliVO selectVO(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
	
	List<HuiyuanxinxiguanliView> selectListView(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);

	List<HuiyuanxinxiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
	
	HuiyuanxinxiguanliView selectView(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
	
}
