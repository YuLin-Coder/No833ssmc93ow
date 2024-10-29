package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenduihuanshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenduihuanshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenduihuanshenheView;


/**
 * 积分兑换审核
 *
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface JifenduihuanshenheService extends IService<JifenduihuanshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenduihuanshenheVO> selectListVO(Wrapper<JifenduihuanshenheEntity> wrapper);
   	
   	JifenduihuanshenheVO selectVO(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
   	
   	List<JifenduihuanshenheView> selectListView(Wrapper<JifenduihuanshenheEntity> wrapper);
   	
   	JifenduihuanshenheView selectView(@Param("ew") Wrapper<JifenduihuanshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenduihuanshenheEntity> wrapper);
   	
}

