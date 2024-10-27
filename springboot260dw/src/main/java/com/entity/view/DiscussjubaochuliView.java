package com.entity.view;

import com.entity.DiscussjubaochuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 举报处理评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-07 13:32:30
 */
@TableName("discussjubaochuli")
public class DiscussjubaochuliView  extends DiscussjubaochuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjubaochuliView(){
	}
 
 	public DiscussjubaochuliView(DiscussjubaochuliEntity discussjubaochuliEntity){
 	try {
			BeanUtils.copyProperties(this, discussjubaochuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
