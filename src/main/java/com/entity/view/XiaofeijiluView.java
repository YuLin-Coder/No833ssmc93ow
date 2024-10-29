package com.entity.view;

import com.entity.XiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
@TableName("xiaofeijilu")
public class XiaofeijiluView  extends XiaofeijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeijiluView(){
	}
 
 	public XiaofeijiluView(XiaofeijiluEntity xiaofeijiluEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
