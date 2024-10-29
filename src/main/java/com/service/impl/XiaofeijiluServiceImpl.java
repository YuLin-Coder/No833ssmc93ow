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


import com.dao.XiaofeijiluDao;
import com.entity.XiaofeijiluEntity;
import com.service.XiaofeijiluService;
import com.entity.vo.XiaofeijiluVO;
import com.entity.view.XiaofeijiluView;

@Service("xiaofeijiluService")
public class XiaofeijiluServiceImpl extends ServiceImpl<XiaofeijiluDao, XiaofeijiluEntity> implements XiaofeijiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeijiluEntity> page = this.selectPage(
                new Query<XiaofeijiluEntity>(params).getPage(),
                new EntityWrapper<XiaofeijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeijiluEntity> wrapper) {
		  Page<XiaofeijiluView> page =new Query<XiaofeijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeijiluVO> selectListVO(Wrapper<XiaofeijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeijiluVO selectVO(Wrapper<XiaofeijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeijiluView> selectListView(Wrapper<XiaofeijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeijiluView selectView(Wrapper<XiaofeijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
