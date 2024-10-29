package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会员信息管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
@TableName("huiyuanxinxiguanli")
public class HuiyuanxinxiguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanxinxiguanliEntity() {
		
	}
	
	public HuiyuanxinxiguanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
