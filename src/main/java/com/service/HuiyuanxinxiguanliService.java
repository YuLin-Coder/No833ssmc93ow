package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanxinxiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanxinxiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanxinxiguanliView;


/**
 * 会员信息管理
 *
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface HuiyuanxinxiguanliService extends IService<HuiyuanxinxiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanxinxiguanliVO> selectListVO(Wrapper<HuiyuanxinxiguanliEntity> wrapper);
   	
   	HuiyuanxinxiguanliVO selectVO(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
   	
   	List<HuiyuanxinxiguanliView> selectListView(Wrapper<HuiyuanxinxiguanliEntity> wrapper);
   	
   	HuiyuanxinxiguanliView selectView(@Param("ew") Wrapper<HuiyuanxinxiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanxinxiguanliEntity> wrapper);
   	
}

