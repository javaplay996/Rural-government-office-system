package com.dao;

import com.entity.ChangyongziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangyongziliaoVO;
import com.entity.view.ChangyongziliaoView;


/**
 * 常用资料
 * 
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public interface ChangyongziliaoDao extends BaseMapper<ChangyongziliaoEntity> {
	
	List<ChangyongziliaoVO> selectListVO(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
	
	ChangyongziliaoVO selectVO(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
	
	List<ChangyongziliaoView> selectListView(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);

	List<ChangyongziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
	
	ChangyongziliaoView selectView(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
	

}
