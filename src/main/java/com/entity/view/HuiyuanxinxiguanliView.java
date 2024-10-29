package com.entity.view;

import com.entity.HuiyuanxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员信息管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
@TableName("huiyuanxinxiguanli")
public class HuiyuanxinxiguanliView  extends HuiyuanxinxiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanxinxiguanliView(){
	}
 
 	public HuiyuanxinxiguanliView(HuiyuanxinxiguanliEntity huiyuanxinxiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanxinxiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
