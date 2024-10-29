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


import com.dao.JifenduihuanDao;
import com.entity.JifenduihuanEntity;
import com.service.JifenduihuanService;
import com.entity.vo.JifenduihuanVO;
import com.entity.view.JifenduihuanView;

@Service("jifenduihuanService")
public class JifenduihuanServiceImpl extends ServiceImpl<JifenduihuanDao, JifenduihuanEntity> implements JifenduihuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenduihuanEntity> page = this.selectPage(
                new Query<JifenduihuanEntity>(params).getPage(),
                new EntityWrapper<JifenduihuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenduihuanEntity> wrapper) {
		  Page<JifenduihuanView> page =new Query<JifenduihuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenduihuanVO> selectListVO(Wrapper<JifenduihuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenduihuanVO selectVO(Wrapper<JifenduihuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenduihuanView> selectListView(Wrapper<JifenduihuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenduihuanView selectView(Wrapper<JifenduihuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
