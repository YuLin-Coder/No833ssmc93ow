package com.entity.vo;

import com.entity.JifenduihuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 积分兑换
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public class JifenduihuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 使用积分
	 */
	
	private Integer shiyongjifen;
		
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品简介
	 */
	
	private String shangpinjianjie;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
				
	
	/**
	 * 设置：使用积分
	 */
	 
	public void setShiyongjifen(Integer shiyongjifen) {
		this.shiyongjifen = shiyongjifen;
	}
	
	/**
	 * 获取：使用积分
	 */
	public Integer getShiyongjifen() {
		return shiyongjifen;
	}
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品简介
	 */
	 
	public void setShangpinjianjie(String shangpinjianjie) {
		this.shangpinjianjie = shangpinjianjie;
	}
	
	/**
	 * 获取：商品简介
	 */
	public String getShangpinjianjie() {
		return shangpinjianjie;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
			
}
