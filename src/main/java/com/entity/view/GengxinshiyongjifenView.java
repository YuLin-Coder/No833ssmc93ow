package com.entity.view;

import com.entity.GengxinshiyongjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 更新使用积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
@TableName("gengxinshiyongjifen")
public class GengxinshiyongjifenView  extends GengxinshiyongjifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GengxinshiyongjifenView(){
	}
 
 	public GengxinshiyongjifenView(GengxinshiyongjifenEntity gengxinshiyongjifenEntity){
 	try {
			BeanUtils.copyProperties(this, gengxinshiyongjifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
