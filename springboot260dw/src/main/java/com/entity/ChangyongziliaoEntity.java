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
 * 常用资料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
@TableName("changyongziliao")
public class ChangyongziliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChangyongziliaoEntity() {
		
	}
	
	public ChangyongziliaoEntity(T t) {
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
	 * 资料名称
	 */
					
	private String ziliaomingcheng;
	
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
	 * 设置：资料名称
	 */
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
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
