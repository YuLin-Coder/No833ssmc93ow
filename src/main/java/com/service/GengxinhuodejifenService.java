package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GengxinhuodejifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GengxinhuodejifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GengxinhuodejifenView;


/**
 * 更新获得积分
 *
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface GengxinhuodejifenService extends IService<GengxinhuodejifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GengxinhuodejifenVO> selectListVO(Wrapper<GengxinhuodejifenEntity> wrapper);
   	
   	GengxinhuodejifenVO selectVO(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
   	
   	List<GengxinhuodejifenView> selectListView(Wrapper<GengxinhuodejifenEntity> wrapper);
   	
   	GengxinhuodejifenView selectView(@Param("ew") Wrapper<GengxinhuodejifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GengxinhuodejifenEntity> wrapper);
   	
}

