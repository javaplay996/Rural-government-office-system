package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangyongziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangyongziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangyongziliaoView;


/**
 * 常用资料
 *
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public interface ChangyongziliaoService extends IService<ChangyongziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangyongziliaoVO> selectListVO(Wrapper<ChangyongziliaoEntity> wrapper);
   	
   	ChangyongziliaoVO selectVO(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
   	
   	List<ChangyongziliaoView> selectListView(Wrapper<ChangyongziliaoEntity> wrapper);
   	
   	ChangyongziliaoView selectView(@Param("ew") Wrapper<ChangyongziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangyongziliaoEntity> wrapper);
   	

}

