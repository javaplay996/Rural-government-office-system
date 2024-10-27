package com.entity.vo;

import com.entity.ChangyongziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 常用资料
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public class ChangyongziliaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料类型
	 */
	
	private String ziliaoleixing;
		
	/**
	 * 资料图片
	 */
	
	private String ziliaotupian;
		
	/**
	 * 资料附件
	 */
	
	private String ziliaofujian;
		
	/**
	 * 资料内容
	 */
	
	private String ziliaoneirong;
				
	
	/**
	 * 设置：资料类型
	 */
	 
	public void setZiliaoleixing(String ziliaoleixing) {
		this.ziliaoleixing = ziliaoleixing;
	}
	
	/**
	 * 获取：资料类型
	 */
	public String getZiliaoleixing() {
		return ziliaoleixing;
	}
				
	
	/**
	 * 设置：资料图片
	 */
	 
	public void setZiliaotupian(String ziliaotupian) {
		this.ziliaotupian = ziliaotupian;
	}
	
	/**
	 * 获取：资料图片
	 */
	public String getZiliaotupian() {
		return ziliaotupian;
	}
				
	
	/**
	 * 设置：资料附件
	 */
	 
	public void setZiliaofujian(String ziliaofujian) {
		this.ziliaofujian = ziliaofujian;
	}
	
	/**
	 * 获取：资料附件
	 */
	public String getZiliaofujian() {
		return ziliaofujian;
	}
				
	
	/**
	 * 设置：资料内容
	 */
	 
	public void setZiliaoneirong(String ziliaoneirong) {
		this.ziliaoneirong = ziliaoneirong;
	}
	
	/**
	 * 获取：资料内容
	 */
	public String getZiliaoneirong() {
		return ziliaoneirong;
	}
			
}
