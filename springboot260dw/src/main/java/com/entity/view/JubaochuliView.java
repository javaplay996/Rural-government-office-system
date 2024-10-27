package com.entity.view;

import com.entity.JubaochuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 举报处理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
@TableName("jubaochuli")
public class JubaochuliView  extends JubaochuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JubaochuliView(){
	}
 
 	public JubaochuliView(JubaochuliEntity jubaochuliEntity){
 	try {
			BeanUtils.copyProperties(this, jubaochuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
