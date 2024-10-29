package com.entity.vo;

import com.entity.GengxinshiyongjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 更新使用积分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:43
 */
public class GengxinshiyongjifenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 商品编号
	 */
	
	private String shangpinbianhao;
		
	/**
	 * 使用积分
	 */
	
	private String shiyongjifen;
				
	
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
	 * 设置：商品编号
	 */
	 
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
				
	
	/**
	 * 设置：使用积分
	 */
	 
	public void setShiyongjifen(String shiyongjifen) {
		this.shiyongjifen = shiyongjifen;
	}
	
	/**
	 * 获取：使用积分
	 */
	public String getShiyongjifen() {
		return shiyongjifen;
	}
			
}
