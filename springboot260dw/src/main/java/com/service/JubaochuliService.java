package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubaochuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubaochuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubaochuliView;


/**
 * 举报处理
 *
 * @author 
 * @email 
 * @date 2023-03-07 13:32:29
 */
public interface JubaochuliService extends IService<JubaochuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubaochuliVO> selectListVO(Wrapper<JubaochuliEntity> wrapper);
   	
   	JubaochuliVO selectVO(@Param("ew") Wrapper<JubaochuliEntity> wrapper);
   	
   	List<JubaochuliView> selectListView(Wrapper<JubaochuliEntity> wrapper);
   	
   	JubaochuliView selectView(@Param("ew") Wrapper<JubaochuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubaochuliEntity> wrapper);
   	

}

