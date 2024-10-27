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
 * 举报处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
@TableName("jubaochuli")
public class JubaochuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JubaochuliEntity() {
		
	}
	
	public JubaochuliEntity(T t) {
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
	 * 处理名称
	 */
					
	private String chulimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chuliriqi;
	
	
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
	 * 设置：处理名称
	 */
	public void setChulimingcheng(String chulimingcheng) {
		this.chulimingcheng = chulimingcheng;
	}
	/**
	 * 获取：处理名称
	 */
	public String getChulimingcheng() {
		return chulimingcheng;
	}
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
