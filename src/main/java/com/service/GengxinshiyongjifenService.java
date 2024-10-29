package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GengxinshiyongjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GengxinshiyongjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GengxinshiyongjifenView;


/**
 * 更新使用积分
 *
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public interface GengxinshiyongjifenService extends IService<GengxinshiyongjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GengxinshiyongjifenVO> selectListVO(Wrapper<GengxinshiyongjifenEntity> wrapper);
   	
   	GengxinshiyongjifenVO selectVO(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
   	
   	List<GengxinshiyongjifenView> selectListView(Wrapper<GengxinshiyongjifenEntity> wrapper);
   	
   	GengxinshiyongjifenView selectView(@Param("ew") Wrapper<GengxinshiyongjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GengxinshiyongjifenEntity> wrapper);
   	
}

