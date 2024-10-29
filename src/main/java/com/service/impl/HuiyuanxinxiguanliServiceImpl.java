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


import com.dao.HuiyuanxinxiguanliDao;
import com.entity.HuiyuanxinxiguanliEntity;
import com.service.HuiyuanxinxiguanliService;
import com.entity.vo.HuiyuanxinxiguanliVO;
import com.entity.view.HuiyuanxinxiguanliView;

@Service("huiyuanxinxiguanliService")
public class HuiyuanxinxiguanliServiceImpl extends ServiceImpl<HuiyuanxinxiguanliDao, HuiyuanxinxiguanliEntity> implements HuiyuanxinxiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanxinxiguanliEntity> page = this.selectPage(
                new Query<HuiyuanxinxiguanliEntity>(params).getPage(),
                new EntityWrapper<HuiyuanxinxiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanxinxiguanliEntity> wrapper) {
		  Page<HuiyuanxinxiguanliView> page =new Query<HuiyuanxinxiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanxinxiguanliVO> selectListVO(Wrapper<HuiyuanxinxiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanxinxiguanliVO selectVO(Wrapper<HuiyuanxinxiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanxinxiguanliView> selectListView(Wrapper<HuiyuanxinxiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanxinxiguanliView selectView(Wrapper<HuiyuanxinxiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
