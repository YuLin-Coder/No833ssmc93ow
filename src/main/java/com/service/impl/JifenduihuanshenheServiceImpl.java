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


import com.dao.JifenduihuanshenheDao;
import com.entity.JifenduihuanshenheEntity;
import com.service.JifenduihuanshenheService;
import com.entity.vo.JifenduihuanshenheVO;
import com.entity.view.JifenduihuanshenheView;

@Service("jifenduihuanshenheService")
public class JifenduihuanshenheServiceImpl extends ServiceImpl<JifenduihuanshenheDao, JifenduihuanshenheEntity> implements JifenduihuanshenheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenduihuanshenheEntity> page = this.selectPage(
                new Query<JifenduihuanshenheEntity>(params).getPage(),
                new EntityWrapper<JifenduihuanshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenduihuanshenheEntity> wrapper) {
		  Page<JifenduihuanshenheView> page =new Query<JifenduihuanshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenduihuanshenheVO> selectListVO(Wrapper<JifenduihuanshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenduihuanshenheVO selectVO(Wrapper<JifenduihuanshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenduihuanshenheView> selectListView(Wrapper<JifenduihuanshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenduihuanshenheView selectView(Wrapper<JifenduihuanshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
