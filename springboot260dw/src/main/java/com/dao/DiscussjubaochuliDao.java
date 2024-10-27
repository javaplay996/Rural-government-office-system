package com.dao;

import com.entity.DiscussjubaochuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjubaochuliVO;
import com.entity.view.DiscussjubaochuliView;


/**
 * 举报处理评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-07 13:32:30
 */
public interface DiscussjubaochuliDao extends BaseMapper<DiscussjubaochuliEntity> {
	
	List<DiscussjubaochuliVO> selectListVO(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
	
	DiscussjubaochuliVO selectVO(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
	
	List<DiscussjubaochuliView> selectListView(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);

	List<DiscussjubaochuliView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
	
	DiscussjubaochuliView selectView(@Param("ew") Wrapper<DiscussjubaochuliEntity> wrapper);
	

}
