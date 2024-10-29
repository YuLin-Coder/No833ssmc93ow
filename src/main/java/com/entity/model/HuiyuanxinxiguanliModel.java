package com.entity.model;

import com.entity.HuiyuanxinxiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会员信息管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public class HuiyuanxinxiguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 会员等级
	 */
	
	private String huiyuandengji;
		
	/**
	 * 折扣
	 */
	
	private String zhekou;
		
	/**
	 * 充值金额
	 */
	
	private String chongzhijine;
		
	/**
	 * 获得积分
	 */
	
	private Integer huodejifen;
		
	/**
	 * 使用积分
	 */
	
	private Integer shiyongjifen;
		
	/**
	 * 总积分
	 */
	
	private Integer zongjifen;
				
	
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：会员等级
	 */
	 
	public void setHuiyuandengji(String huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	
	/**
	 * 获取：会员等级
	 */
	public String getHuiyuandengji() {
		return huiyuandengji;
	}
				
	
	/**
	 * 设置：折扣
	 */
	 
	public void setZhekou(String zhekou) {
		this.zhekou = zhekou;
	}
	
	/**
	 * 获取：折扣
	 */
	public String getZhekou() {
		return zhekou;
	}
				
	
	/**
	 * 设置：充值金额
	 */
	 
	public void setChongzhijine(String chongzhijine) {
		this.chongzhijine = chongzhijine;
	}
	
	/**
	 * 获取：充值金额
	 */
	public String getChongzhijine() {
		return chongzhijine;
	}
				
	
	/**
	 * 设置：获得积分
	 */
	 
	public void setHuodejifen(Integer huodejifen) {
		this.huodejifen = huodejifen;
	}
	
	/**
	 * 获取：获得积分
	 */
	public Integer getHuodejifen() {
		return huodejifen;
	}
				
	
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
	 * 设置：总积分
	 */
	 
	public void setZongjifen(Integer zongjifen) {
		this.zongjifen = zongjifen;
	}
	
	/**
	 * 获取：总积分
	 */
	public Integer getZongjifen() {
		return zongjifen;
	}
			
}
