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


import com.dao.GengxinshiyongjifenDao;
import com.entity.GengxinshiyongjifenEntity;
import com.service.GengxinshiyongjifenService;
import com.entity.vo.GengxinshiyongjifenVO;
import com.entity.view.GengxinshiyongjifenView;

@Service("gengxinshiyongjifenService")
public class GengxinshiyongjifenServiceImpl extends ServiceImpl<GengxinshiyongjifenDao, GengxinshiyongjifenEntity> implements GengxinshiyongjifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GengxinshiyongjifenEntity> page = this.selectPage(
                new Query<GengxinshiyongjifenEntity>(params).getPage(),
                new EntityWrapper<GengxinshiyongjifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GengxinshiyongjifenEntity> wrapper) {
		  Page<GengxinshiyongjifenView> page =new Query<GengxinshiyongjifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GengxinshiyongjifenVO> selectListVO(Wrapper<GengxinshiyongjifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GengxinshiyongjifenVO selectVO(Wrapper<GengxinshiyongjifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GengxinshiyongjifenView> selectListView(Wrapper<GengxinshiyongjifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GengxinshiyongjifenView selectView(Wrapper<GengxinshiyongjifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
