package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeijiluView;


/**
 * 消费记录
 *
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public interface XiaofeijiluService extends IService<XiaofeijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeijiluVO> selectListVO(Wrapper<XiaofeijiluEntity> wrapper);
   	
   	XiaofeijiluVO selectVO(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
   	
   	List<XiaofeijiluView> selectListView(Wrapper<XiaofeijiluEntity> wrapper);
   	
   	XiaofeijiluView selectView(@Param("ew") Wrapper<XiaofeijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeijiluEntity> wrapper);
   	
}

