package com.entity.vo;

import com.entity.GengxinhuodejifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 更新获得积分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public class GengxinhuodejifenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 订单编号
	 */
	
	private String dingdanbianhao;
		
	/**
	 * 获得积分
	 */
	
	private String huodejifen;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：订单编号
	 */
	 
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
				
	
	/**
	 * 设置：获得积分
	 */
	 
	public void setHuodejifen(String huodejifen) {
		this.huodejifen = huodejifen;
	}
	
	/**
	 * 获取：获得积分
	 */
	public String getHuodejifen() {
		return huodejifen;
	}
			
}
