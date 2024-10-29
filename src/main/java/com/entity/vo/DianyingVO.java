package com.entity.vo;

import com.entity.DianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电影
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 11:25:42
 */
public class DianyingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 上映日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangyingriqi;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 演员
	 */
	
	private String yanyuan;
		
	/**
	 * 放映厅
	 */
	
	private String fangyingting;
		
	/**
	 * 播放场次
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bofangchangci;
		
	/**
	 * 电影预告
	 */
	
	private String dianyingyugao;
		
	/**
	 * 电影简介
	 */
	
	private String dianyingjianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：上映日期
	 */
	 
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：演员
	 */
	 
	public void setYanyuan(String yanyuan) {
		this.yanyuan = yanyuan;
	}
	
	/**
	 * 获取：演员
	 */
	public String getYanyuan() {
		return yanyuan;
	}
				
	
	/**
	 * 设置：放映厅
	 */
	 
	public void setFangyingting(String fangyingting) {
		this.fangyingting = fangyingting;
	}
	
	/**
	 * 获取：放映厅
	 */
	public String getFangyingting() {
		return fangyingting;
	}
				
	
	/**
	 * 设置：播放场次
	 */
	 
	public void setBofangchangci(Date bofangchangci) {
		this.bofangchangci = bofangchangci;
	}
	
	/**
	 * 获取：播放场次
	 */
	public Date getBofangchangci() {
		return bofangchangci;
	}
				
	
	/**
	 * 设置：电影预告
	 */
	 
	public void setDianyingyugao(String dianyingyugao) {
		this.dianyingyugao = dianyingyugao;
	}
	
	/**
	 * 获取：电影预告
	 */
	public String getDianyingyugao() {
		return dianyingyugao;
	}
				
	
	/**
	 * 设置：电影简介
	 */
	 
	public void setDianyingjianjie(String dianyingjianjie) {
		this.dianyingjianjie = dianyingjianjie;
	}
	
	/**
	 * 获取：电影简介
	 */
	public String getDianyingjianjie() {
		return dianyingjianjie;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
