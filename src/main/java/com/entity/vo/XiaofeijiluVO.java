package com.entity.vo;

import com.entity.XiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 消费记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public class XiaofeijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
