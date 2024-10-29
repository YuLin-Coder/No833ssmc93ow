package com.entity.view;

import com.entity.JifenduihuanshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积分兑换审核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
@TableName("jifenduihuanshenhe")
public class JifenduihuanshenheView  extends JifenduihuanshenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JifenduihuanshenheView(){
	}
 
 	public JifenduihuanshenheView(JifenduihuanshenheEntity jifenduihuanshenheEntity){
 	try {
			BeanUtils.copyProperties(this, jifenduihuanshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
