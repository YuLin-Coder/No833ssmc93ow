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
 * 消费记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
@TableName("xiaofeijilu")
public class XiaofeijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaofeijiluEntity() {
		
	}
	
	public XiaofeijiluEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 消费详情
	 */
					
	private String xiaofeixiangqing;
	
	/**
	 * 消费对象
	 */
					
	private String xiaofeiduixiang;
	
	/**
	 * 获得积分
	 */
					
	private Integer huodejifen;
	
	/**
	 * 消费日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiaofeiriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 会员等级
	 */
					
	private String huiyuandengji;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	
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
	 * 设置：消费详情
	 */
	public void setXiaofeixiangqing(String xiaofeixiangqing) {
		this.xiaofeixiangqing = xiaofeixiangqing;
	}
	/**
	 * 获取：消费详情
	 */
	public String getXiaofeixiangqing() {
		return xiaofeixiangqing;
	}
	/**
	 * 设置：消费对象
	 */
	public void setXiaofeiduixiang(String xiaofeiduixiang) {
		this.xiaofeiduixiang = xiaofeiduixiang;
	}
	/**
	 * 获取：消费对象
	 */
	public String getXiaofeiduixiang() {
		return xiaofeiduixiang;
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
	 * 设置：消费日期
	 */
	public void setXiaofeiriqi(Date xiaofeiriqi) {
		this.xiaofeiriqi = xiaofeiriqi;
	}
	/**
	 * 获取：消费日期
	 */
	public Date getXiaofeiriqi() {
		return xiaofeiriqi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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

}
