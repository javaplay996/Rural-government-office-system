package com.entity.vo;

import com.entity.JubaochuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 举报处理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public class JubaochuliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 处理类型
	 */
	
	private String chulileixing;
		
	/**
	 * 处理进度
	 */
	
	private String chulijindu;
		
	/**
	 * 处理图片
	 */
	
	private String chulitupian;
		
	/**
	 * 处理内容
	 */
	
	private String chulineirong;
		
	/**
	 * 处理日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuliriqi;
				
	
	/**
	 * 设置：处理类型
	 */
	 
	public void setChulileixing(String chulileixing) {
		this.chulileixing = chulileixing;
	}
	
	/**
	 * 获取：处理类型
	 */
	public String getChulileixing() {
		return chulileixing;
	}
				
	
	/**
	 * 设置：处理进度
	 */
	 
	public void setChulijindu(String chulijindu) {
		this.chulijindu = chulijindu;
	}
	
	/**
	 * 获取：处理进度
	 */
	public String getChulijindu() {
		return chulijindu;
	}
				
	
	/**
	 * 设置：处理图片
	 */
	 
	public void setChulitupian(String chulitupian) {
		this.chulitupian = chulitupian;
	}
	
	/**
	 * 获取：处理图片
	 */
	public String getChulitupian() {
		return chulitupian;
	}
				
	
	/**
	 * 设置：处理内容
	 */
	 
	public void setChulineirong(String chulineirong) {
		this.chulineirong = chulineirong;
	}
	
	/**
	 * 获取：处理内容
	 */
	public String getChulineirong() {
		return chulineirong;
	}
				
	
	/**
	 * 设置：处理日期
	 */
	 
	public void setChuliriqi(Date chuliriqi) {
		this.chuliriqi = chuliriqi;
	}
	
	/**
	 * 获取：处理日期
	 */
	public Date getChuliriqi() {
		return chuliriqi;
	}
			
}