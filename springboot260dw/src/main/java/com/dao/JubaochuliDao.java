package com.dao;

import com.entity.JubaochuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubaochuliVO;
import com.entity.view.JubaochuliView;


/**
 * 举报处理
 * 
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public interface JubaochuliDao extends BaseMapper<JubaochuliEntity> {
	
	List<JubaochuliVO> selectListVO(@Param("ew") Wrapper<JubaochuliEntity> wrapper);
	
	JubaochuliVO selectVO(@Param("ew") Wrapper<JubaochuliEntity> wrapper);
	
	List<JubaochuliView> selectListView(@Param("ew") Wrapper<JubaochuliEntity> wrapper);

	List<JubaochuliView> selectListView(Pagination page,@Param("ew") Wrapper<JubaochuliEntity> wrapper);
	
	JubaochuliView selectView(@Param("ew") Wrapper<JubaochuliEntity> wrapper);
	

}
