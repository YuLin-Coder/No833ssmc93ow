package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GengxinhuodejifenDao;
import com.entity.GengxinhuodejifenEntity;
import com.service.GengxinhuodejifenService;
import com.entity.vo.GengxinhuodejifenVO;
import com.entity.view.GengxinhuodejifenView;

@Service("gengxinhuodejifenService")
public class GengxinhuodejifenServiceImpl extends ServiceImpl<GengxinhuodejifenDao, GengxinhuodejifenEntity> implements GengxinhuodejifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GengxinhuodejifenEntity> page = this.selectPage(
                new Query<GengxinhuodejifenEntity>(params).getPage(),
                new EntityWrapper<GengxinhuodejifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GengxinhuodejifenEntity> wrapper) {
		  Page<GengxinhuodejifenView> page =new Query<GengxinhuodejifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GengxinhuodejifenVO> selectListVO(Wrapper<GengxinhuodejifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GengxinhuodejifenVO selectVO(Wrapper<GengxinhuodejifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GengxinhuodejifenView> selectListView(Wrapper<GengxinhuodejifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GengxinhuodejifenView selectView(Wrapper<GengxinhuodejifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
